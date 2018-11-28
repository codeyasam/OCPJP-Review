/* Creating Cyclic Barrier 
*
* Our zoo workers are back, and this time they are cleaning pens. Imagine that there is a lion pen that needs to be emptied, cleaned and then filled back up with the lions. 
*/

/* LionPenManager - possible output
* 
* Removing animals
* Removing animals
* Cleaning the pen
* Adding animals
etc.
this would be chaotic
*/

import java.util.concurrent.*;

class LionPenManager {
    
    private void removeAnimals() {
        System.out.println("Removing Animals.");
    }
    
    private void cleanPen() {
        System.out.println("Cleaning the Pen.");
    }
    
    private void addAnimals() {
        System.out.println("Adding animals.");
    }
    
    public void performTask() {
        removeAnimals();
        cleanPen();
        addAnimals();
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask());
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}

class RevisedLionPenManager {
    
    private void removeAnimals() {
        System.out.println("Removing Animals.");
    }
    
    private void cleanPen() {
        System.out.println("Cleaning the Pen.");
    }
    
    private void addAnimals() {
        System.out.println("Adding animals.");
    }
    
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
        }
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            RevisedLionPenManager manager = new RevisedLionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned")); // called a Runnable upon completion
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}

// NOTE: changing the implementation to: ExecutorService service = Executors.newFixedThreadPool(2); 
// The code will hang infinitely since new CyclicBarier(4) is waiting for 4 threads to exist

// Reusing Cyclic Barrier - After a cyclic barrier is broken, all threads are released and the number of threads waiting on the Cyclic Barrier goes back to zero.