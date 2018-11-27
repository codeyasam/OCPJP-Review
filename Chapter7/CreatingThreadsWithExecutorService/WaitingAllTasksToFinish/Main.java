/* Waiting all tasks to finish 
*
* call shutdown() then awaitTermination() - waits for specified time to complete all tasks. 

* In this example, we submit a number of tasks to the thread executor and then shut down the thread executor and wait up to one minute 
for the results. Notice that we can call isTerminated() after the awaitTermination() method finishes to confirm that all tasks are actually finished. 
*/

import java.util.concurrent.*;

public class Main {
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the executor
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        
        if (service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);
            // Check wether all tasks are finished 
            if (service.isTerminated()) {
                System.out.println("All tasks finished.");
            } else {
                System.out.println("All least one task is still running");
            }
        }
        
    }
    
}