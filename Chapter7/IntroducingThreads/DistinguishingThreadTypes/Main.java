/* Distinguishing Thread Types 
*
* A system-defined-thread is created by the JVM and runs in the background of the application.

e.g. The garbage collection thread is a system thread that is created by the JVM and runs in background, helping to free memory that is no longer in use. 

* A user-defined-thread is one created by the application developer to accomplish a specific task. All of the applications that we have created up to this point have been multithreaded, but they contained only one user-defined-thread, which calls the main() method. 

For simplicity, we commonly refer to threads that contain only a single user-defined-thread as a single-threaded-application. (since we are often uninterested in the system-defined-threads)
*/