import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(new ArrayList());
        System.out.println(new String[0]);
        
        Hippo h1 = new Hippo("Harry", 3100);
        System.out.println(h1);
    }    
    
}

class Hippo {
    
    private String name;
    private double weight;
    
    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
} 