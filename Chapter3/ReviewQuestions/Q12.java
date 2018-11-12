/* Q12: Which of these statements can fill in the blank so that the Helper class compiles successfully? */

import java.io.FileNotFoundException;

public class Q12 {
    
    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A"));   // prints A
        Helper.printException(new Exception("B"));               // prints B
        Helper.<Throwable>printException(new Exception("C"));    // won't compile Throwable is the parent of Exception
        Helper.<NullPointerException>printException(new NullPointerException("D")); // prints D
        Helper.printException(new Throwable("E"));               // won't compile Throwable is the parent of Exception
    }
    
}

class Helper {
    
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
    
}