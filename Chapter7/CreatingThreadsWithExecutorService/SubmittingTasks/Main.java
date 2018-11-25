/* Submitting Tasks 
*
* You can submit tasks to an ExecutorService instance multiple ways.

* execute() - takes Runnable lambda expression or instance and completes task asynchronously. void return type. Considered as "Fire and Forget" method

* submit() - returns a Future object that can be used to determine if the task is complete. 

* ExecutorService methods
* Method Name                              Description
* void execute(Runnable command)           Executes a Runnable task at some point in the future. 
* Future<?> submit(Runnable task)          Executes a Runnable task at some point in the future and returns a Future representing the task.
* <T> Future<T> submit(Callable<T> task)   Executes a Callable task at some point in the future and returns a Future representing the pending results of the task
* <T> List<Future<T>> invokeAll(           Executes the given tasks, synchronously returning the results of all tasks as a Collection of 
Collection<? extends Callable<T>> tasks)   Future objects, in the same order they were in the original collection
throws InterruptedException
* <T> T invokeAny(Collection<              Executes the given tasks, synchronously returning the results of one of finished task, cancelling
? extends Callable<T>> tasks)              any unfinished tasks
throws InterruptedException, 
ExecutionException
*/

