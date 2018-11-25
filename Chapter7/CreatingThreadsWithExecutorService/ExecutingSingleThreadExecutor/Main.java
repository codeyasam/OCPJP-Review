/* Executing Single Thread Executor 
*
* The Concurrency API includes the Executors factory class that can be used to create instances of the ExecutorService object.

* Executors.newSingleThreadExecutor();
*/

import java.util.concurrent.*;

class ZooInfo {
    public static void main(String[] args) {
        // only one thread - this will order the result.
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();  
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> { for (int i = 0; i < 3; i++) 
                System.out.println("Printing record: " + i);
            });
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}

// Although tasks are guaranteed to be executed in the order in which they are submitted for a single thread executor, you avoid relying on this behavior to order events. As you will see in the later chapter, when we increase the number of threads in the executor service, this gurantee disappears.