/* Improving Access with Synchronized Blocks 
*
* How do we improve the results so that each worker is able to increment and report the results in order? 
* A monitor also called lock is a structure that supports mutual exclusion or the property that at most one thread is executing a particular segment of code
* at a given time. 

* In Java, any Object can be used as a monitor, along with the synchronized keyword:
SheepManager manager = new SheepManager();
synchronized(manager) {
    // Work to be completed by one thread at a time
}

* This example is referred to as a synchronized block.  
*/

import java.util.concurrent.*;

class SheepManager {
    
    private int sheepCount = 0;
    
    private void incrementAndReport() {
        synchronized(this) {
            System.out.println((++sheepCount) + " ");
        }
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

/* note: the following code snippet would have also worked
    private final Object lock = new Object();
    private void incrementAndReport() {
        synchronized(lock) {
            System.out.println((++sheepCount) + " ");
        }
    }
*/