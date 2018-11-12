/* Q6: What is the result of the following code? */

public class Q6 {
    
    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));       // compiler warning - uses unchecked or unsafe operations
        // will print hithere
    }
    
}

class Hello<T> {
    T t;
    public Hello(T t) {
        this.t = t;
    }
    
    public String toString() {
        return t.toString();
    }
    
    
}