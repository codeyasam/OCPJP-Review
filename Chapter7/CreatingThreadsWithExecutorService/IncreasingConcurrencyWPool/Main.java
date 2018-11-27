/* Increasing Concurrency with Pools 
*
* 3 additional factory methods in the Executors class that act on a pool of threads, rather than on a single thread.

* A thread pool is a group of pre-instantiated reusable threads that are available to perform a set of arbitrary tasks.

* Executors method
* Method Name                         Return Type                    Description
* newSingleThreadExecutor()            ExecutorService                Creates a single-threaded executor that uses a single worker thread operating off an                                                                               unbounded 
                                                                      queue. Results are processed sequentially in the order in which they are submitted.
* newSingleThreadScheduledExecutor()   ScheduledExecutorService       Creates a single-threaded executor that can schedule commands to run after a given delay
                                                                      or to execute periodically
* newCachedThreadPool()                ExecutorService                Creates a thread pool that creates new threads as needed, but will reuse previously 
                                                                      constructed threads when they are available
* newFixedThreadPool(int nThreads)     ExecutorService                Creates a thread pool that reuses a fixed number of threads operating off a shared  
                                                                      unbounded queue.
* newScheduledThreadPool(int nThreads) ScheduleExecutorService        Creates a thread pool that can schedule commands to run after a given delay or execute 
                                                                      periodically.
                                                                      
// Note: While a single thread executor will wait for an available thread to become available before running the next task, a pooled-thread executor can
execute the task concurrently. If the pool runs out of available threads, the task will be queued by the thread executor and wait to be completed.
*/