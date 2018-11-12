/* Q17: Which two options can fill in the blanks to make this code compile? */

public class Q17 {
    
    public static void main(String[] args) {
        Generic<String> g = new Generic<>();
        Generic<Object> g2 = new Generic();    // compiler warning - uses unchecked or unsafe operations 
    }
    
}

class Generic<T> {
    
}