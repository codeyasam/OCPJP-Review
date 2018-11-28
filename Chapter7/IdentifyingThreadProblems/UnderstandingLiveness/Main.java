/* Understanding Liveness 
*
* Liveness is the ability of an application to be able to execute in a timely manner

* Deadlock occurs when two or more threads are blocked forever, each waiting on the other.

* Starvation occurs when a single thread is perpetually denied access to shared resource or lock. The Thread is  still active but it is unable to complete its work as a result of other thread constantly taking the resource that they trying to access.

* Livelock occurs when two or more threads are conceptually blocked forever. Livelock is often a result of two threads trying to resolve a deadlock.

* Imagine that our zoo has two foxes: Foxy and Tails. Foxy likes to eat first and then drink water.
* Tails like to drink water first and then eat. Furthermore, neither animal likes to share, and they will finish their only meal only if they have exclusive access to both food and water. 
* 
*/


import java.util.concurrent.*;

class Food {
}

class Water {
}

class Fox {
    
    public void eatAndDrink(Food food, Water water) {
        synchronized(food) {
            System.out.println("Got Food!");
            move();
            synchronized(water) {
                System.out.println("Got Water!");
            }
        }
    }
    
    public void drinkAndEat(Food food, Water water) {
        synchronized(water) {
            System.out.println("Got Water!");
            move();
            synchronized(food) {
                System.out.println("Got Food!");
            }
        }
    }
    
    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }
    }
    
    public static void main(String[] args) {
        // Create participants and resources
        Fox foxy = new Fox();
        Fox tails = new Fox();
        Food food = new Food();
        Water water = new Water();
        
        // Process data
        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));  
            
            // deadlock
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}