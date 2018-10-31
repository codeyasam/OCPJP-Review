import java.io.IOException;
import java.io.FileNotFoundException;

/* static methods are hidden and not overriden */

public class Overriding {
    
    protected Object baseMethod() throws IOException {
        return null;
    }
    
    public static void main(String[] args) {
            
    }
    
}

class Child extends Overriding {
    
    @Override // the access modifier must be the same or more accessible
    public Integer baseMethod() throws FileNotFoundException { // If any checked exceptions are thrown, only the same exceptions or subclasses of those exceptions are allowed to be thrown.
        // the return type must be the same or more restrictive type (covariant return types)
        return 1;
    }
}