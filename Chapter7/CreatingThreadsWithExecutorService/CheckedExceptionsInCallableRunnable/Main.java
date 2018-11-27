/* Checked Exceptions in Callable and Runnable 
*
* 
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> { Thread.sleep(1000); return null; }); // will compile since it will be treated as Callable
            service.submit(() -> { Thread.sleep(1000); });              // will not compile since it is treated as Runnable and runnable don't throw exception
        } finally {
            if (service != null) {
                service.shutdown();
            }
        } 
    }
    
}