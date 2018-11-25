/* Waiting for Results 
*
* How do we know when a task submitted to an ExecutorService is complete?

Future<?> future = service.submit(() -> System.out.println("Hello Zoo"));

* Future methods
* Method Name             Description
* boolean isDone()        Returns true if the task was completed, throw an exception, or was cancelled.
* boolean isCancelled()   Returns true if the task was cancelled before it completely normally.
* boolean cancel()        Attempts to cancel execution of the task.
* V get()                 Retrieves the result of a task, waiting endlessly if it is not yet available.
* V get(long timeout,     Retrieves the result of a task, waiting the specified amount of time. If the result is not ready by the time the 
TimeUnit unit)            timeout is reached, a checked TimeoutException will be thrown.
throws Interrupted
Exception,
ExecutionException

* TimeUnit Values 
* Enum Value              Description
* TimeUnit.NANOSECONDS    Time in one-billiont of a second (1/1,000,000,000)
* TimeUnit.MICROSECONDS   Time in one-milliont of a second (1/1,000,000)
* TimeUnit.MILLISECONDS   Time in one-thousant of a second (1/1,000)
* TimeUnit.SECONDS        Time in seconds
* TimeUnit.MINUTES        Time in minutes
* TimeUnit.HOURS          Time in hours
* TimeUnit.DAYS           Time in days

// The following is an updated version of our polling example CheckResults class, which uses Future instance to poll for the results.
*/


import java.util.concurrent.*;

class CheckResults {
    
    private static int counter = 0;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });
            
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not Reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}