/* Shutting down an Executor 
*
* once you have finished using a thread executor, it is important that you call the shutdown() method. 

* A thread executor creates a non-daemon thread on the first task that is executed, so failing to call shutdown will result in your application never terminating.

* The shutdown process
* The shutdown process for a thread executor involves first reject any new tasks. During this time, call isShutDown() will return true, while isTerminated will return false. If a new task is submitted to the thread executor while it is shutting down, a RejectExecutionException will be thrown. Once all active tasks have been completed, isShutdown() and isTerminated() will both return true. 

* For the exam, you should be aware that shutdown() does not actually stop any tasks that have already been submitted to the thread executor. What if you want to cancel all running and upcoming tasks? The ExecutorService provides a method called shutdownNow(), which attempts to stop all running tasks and discards any that have not been started yet. 

* Note that shutdownNow() attempts to stop all running tasks. It is possible to create a thread that will never terminate, so any attempt to interrupt it may be ignored. Lastly, shutdownNow() returns a List<Runnable> of tasks that were submitted to the thread executor but that were never started.
*/