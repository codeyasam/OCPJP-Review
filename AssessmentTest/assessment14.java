import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {
    
    // inner class - has access to all instance variables but cannot have static fields
    class RainException extends Exception {
    
    }
    
    public static void main(String[] args) { // String cannot be converted to AutoClosable
        try (Scanner s = new Scanner("rain"); String line = "";) {
            if (s.nextLine().equals("rain")) 
                throw new RainException(); // this should be handled or declared 
                                // non static variable this cannot be referenced from a static context
        } finally {
            s.close(); // cannot find symbol
        }
    }
}