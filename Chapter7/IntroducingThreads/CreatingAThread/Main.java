/* Creating a Thread 
* 
* java.lang.Thread

* executing a thread is a two-step process. First you define the Thread with the corresponding task to be done. Then you start the task by using the Thread.start() method.

* NOTE: Remember that order of thread execution is not often guaranteed.

* Defining the task, or work that a Thread instance will execute can be done two ways in Java.

Provide a Runnable Object or lambda expression to the Thread constructor.

Create a class that extends Thread and override the run() method.

e.g.
public class PrintData implements Runnable {
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record");
        }
    }
    
    public static void main(String[] args) {
        new Thread(new PrintData()).start();
    }
    
}

public class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }
    
    public static void main(String[] args) {
        new ReadInventoryThread().start();
    }
}
*/


class PrintData implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record.");
        }
    }
    
    public static void main(String[] args) {
        new Thread(new PrintData()).start();
    }
}

class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory.");
    }
    
    public static void main(String[] args) {
        new ReadInventory().start();
    }
}

public class Main {
    
    public static void main(String[] args) { // 4 threads
        System.out.println("begin");         // main thread
        new ReadInventoryThread().start();   // another thread
        new Thread(new PrintData()).start(); // another thread
        new ReadInventoryThread().start();   // another thread
        System.out.println("end");
    }
    
}