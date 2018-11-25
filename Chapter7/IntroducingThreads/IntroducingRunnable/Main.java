/* Introducing Runnable 
*
* java.lang.Runnable

* Runnable is a functional interface that takes no argument and returns no data.

* method definition:
@FunctionalInterface public interface Runnable {
    void run();
}

* commonly used to define the work a thread will execute, seperate from the main application thread.

e.g.
() -> System.out.println("Hello world");
() -> { int i = 10; i++; } 
() -> { return; }
() -> {}

* Creating Runnable Classes
public class CalculateAverage implements Runnable {
    public void run() {
        // Define work here
    }
}

* also useful if you need to pass information to your Runnable object to be used by the run() method 

e.g. 
public class CalculateAverages implements Runnable {
    private double[] scores;
    public CalculateAverages(double[] scores) {
        this.scores = scores;
    }
    
    public void run() {
        // Define work here that uses the scores object
    }
}
*/