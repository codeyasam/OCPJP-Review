import java.io.Console;

class Main {
    
    public static void main(String[] args) {
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.println(line);
    }
    
}