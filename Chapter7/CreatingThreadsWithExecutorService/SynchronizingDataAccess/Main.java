/* Synchronizing Data Access 
*
* Thread safety is the property of an object that guarantees safe execution by multiple threads at the same time. 

* Imagine that our zoo program has a program to count sheep, preferably one that won't put the zoo workers to sleep! Each zoo worker runs out to a field, 
adds a new to the flock, counts the total number of sheep and runs back to us to report the results. We present the following code to represent this conceptually.
*/

import java.util.concurrent.*;


class SheepManager { 
    
    private int sheepCount = 0;
    private void incrementAndReport() {
        System.out.println((++sheepCount) + " ");
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}

// Race condition - The unexpected result of two tasks executing at the same time.