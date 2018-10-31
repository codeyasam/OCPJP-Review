import java.time.Duration;
import java.time.Period;

class Main {
    
    public static void main(String[] args) {
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();
        System.out.println(d + " " + p);
        
        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        System.out.println(b1 + " " + b2);
    }
    
}