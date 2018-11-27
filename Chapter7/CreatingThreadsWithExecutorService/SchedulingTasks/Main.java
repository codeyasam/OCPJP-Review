/* Scheduling Tasks 
*
* The need to schedule task to happen at some future time. 

* ScheduledExecutorService methods
* Method Name                      Description
* schedule(Callable<V> callable,   Creates and executes a Callable task after the given delay
long delay, TimeUnit unit) 

* schedule(Runnable command,       Creates and executes a Runnable task after the given delay 
long delay, TimeUnit unit)

* scheduleAtFixedRate(Runnable     Creates and executes a Runnable task after the given initial delay, creating a new task every period 
command, long initialDelay,        value that passes.
long period, TimeUnit unit)

* scheduleAtFixedDelay(Runnable    Creates and executes a Runnable task after the given initial delay and subsequently with the given delay 
command, long initialDelay,        between the termination of one execution and the commencement of the next.
long delay, TimeUnit unit)
*/

import java.util.concurrent.*;

public class Main {
    
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        
        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);
        
        // The first task is scheduled 10 seconds in the future, while the second task is scheduled 8 minutes in the future
    }
    
}