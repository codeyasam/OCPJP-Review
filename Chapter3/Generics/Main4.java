/* Generic Methods
* 
* This often useful for static methods since they aren't part of an instance that can declare the type.
* However, it is also allowed on non static methods as well.
*/

public class Main4 {
    
    public static void main(String[] args) {
        // you can call generic methods normally
        Main4.ship("package");
        Main4.ship(args);
        
        // alternatively
        Main4.<String>ship("package");
        Main4.<String[]>ship(args);
    }
    
    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
    
    public static <T> void sink(T t) {
        
    }
    
    public static <T> T identity(T t) { 
        return t; 
        
    }
    
    public static T noGood(T t) {  // DOES NOT COMPILE
        return t;
    }
}

class Crate<T> {
    
    private T contents;
    
    public T emptyCrate() {
        return contents;
    }
    
    public void packCrate(T contents) {
        this.contents = contents;
    }
    
}