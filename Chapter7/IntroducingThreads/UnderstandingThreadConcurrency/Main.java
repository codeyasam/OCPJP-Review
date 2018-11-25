/* Understanding Thread Concurrency 
* 
* concurrency is the property of executing multiple threads and processes at the same time.

* Thread Scheduler is what the operating systems use to determine which threads should be currently executing.

* Round-robin-schedule each available thread receives an equal number of CPU cycles with which to execute, with threads visited in a circular order. 

e.g. If there are 10 available threads, they might each get 100 milliseconds in which to execute, with the process returning after the last thread has executed.

* Context Switch is the process of storing a thread's current state and later restoring the state of the thread to continue execution. 

e.g. When a thread's alloted time is complete but the thread has not finished processing, a context switch occurs.

* Thread Priority is a numeric value associated with a thread that is taken into consideration by the thread scheduler when determining which threads should currently be executing. 

e.g. A thread can interrupt or supersede another thread if it has a higher thread priority than the other thread.

Java Thread Priority Constants
Constant Variable                 Value
Thread.MIN_PRIORITY               1
Thread.NORM_PRIORITY              5
Thread.MAX_PRIORITY               10

// If two threads have the same priority, the thread scheduler will arbitrarily choose the one to process first in most situations.
*/