/* Q6: What is the output of the following code? */
// G. The code does not compile.
import java.io.*;

class AutocloseableFlow {
    
    static class Door implements AutoCloseable {
        public void close() {
            System.out.print("D");
            throw new RuntimeException();
        }
    }
    
    static class Window implements Autocloseable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException();
        }
    }
    
    public static void main(String[] args) {
        try {
            Door d = new Door();
            Window w = new Window();
        } 
        {
            System.out.println("T");
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    } 
    
}