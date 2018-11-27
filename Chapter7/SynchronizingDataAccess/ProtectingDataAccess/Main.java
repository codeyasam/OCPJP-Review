/* Protecting Data Access 
*
* Atomic is the property of an operation to be carried out as a single unit of execution without any interference by another thread. 

* The concurrency API includes numerous useful classes that are conceptually the same as our primitive classes but that support atomic operations.
* Atomic Classes
* Class Name                   Description
* AtomicBoolean                A boolean value that may be updated atomically
* AtomicInteger 
* AtomicIntegerArray
* AtomicLong
* AtomicLongArray
* AtomicReference 
* AtomicReferenceArray

* Common atomic methods
* method name                  Description
* get()                        Retrieve the current value 
* set()                        Set the given value, equivalent to the assignment = operator
* getAndSet()                  Atomically sets the new value and returns the old value
* incrementAndGet()            For numeric classes, atomic pre-increment operation equivalent to ++value
* getAndIncrement()            For numeric classes, atomic post-increment operation equivalent to value++
* decrementAndGet()            For numeric classes, atomic pre-decrement operation equivalent to --value
* getAndDecrement()            For numeric classes, atomic post-decrement operation equivalent to value--
*/
// update SheepManager class with an AtomicInteger

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;  

class SheepManager {
    
    private AtomicInteger sheepCount = new AtomicInteger(0);
    
    private void incrementAndReport() {
        System.out.println(sheepCount.incrementAndGet());
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                manager.incrementAndReport();
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}

