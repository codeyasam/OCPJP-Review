/* Applying the Fork/Join Framework 
* 
* When a task gets too complicated, we can split the task into multiple tasks using the fork/join framework

* The fork/join framework relies on the concept of recursion to solve complex tasks.

* StackOverflowError anytime the application recurses too deeply

* Conceptually, we start off with a single zoo worker who realizes that they cannot perform all 10 tasks in time. They perform a recursive step by dividing the set of 10 animals into two sets of 5 animals, one set for each worker. The two zoo worker then further subdivide the set until each zoo worker has at most three animals to weigh, which is the base case in our example. 

* Applying the fork/join framework requires us to perform three steps:
1. Create a ForkJoinTask.
2. Create a ForkJoinPool.
3. Start the ForkJoinTask.

* Recursive Action and Recursive Task
Recursive Action - is an abstract class that requires us to implement the compute method() which returns void, to perform the bulk of the work.
Recursive Task   - is analogous to the difference between Runnable and Callable, respectively, which you saw at the start of the chapter. 

// define a WeightAnimalAction that extends the join/fork class RecursionAction:
*/

import java.util.*;
import java.util.concurrent.*;


class WeightAnimalAction extends RecursiveAction {
    private int start;
    private int end;
    private Double[] weights;
    
    public WeightAnimalAction(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }
    
    protected void compute() {
        if (end-start <= 3) {
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighted: " + i);
            }
        } else {
            int middle = start + ((end-start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            invokeAll(new WeightAnimalAction(weights, start, middle),
                     new WeightAnimalAction(weights, middle,end));
        }
    }
    
    public static void main(String[] args) {
        Double[] weights = new Double[10];
        
        ForkJoinTask<?> task = new WeightAnimalAction(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        
        // Print results 
        System.out.println();
        System.out.println("Weights: ");
        Arrays.asList(weights).stream().peek(s -> System.out.println(s)).forEach(d -> System.out.println(d.intValue() + " "));
    }
}

// The key concept to take away from this is that the process was started as a single task, and it spawned additional concurrent tasks to split up the work after it had already started.

// Working with Recursive Task 
class WeighAnimalTask extends RecursiveTask<Double> {
    private int start;
    private int end;
    private Double[] weights;
    
    public WeighAnimalTask(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }
    
    public Double compute() {
        if (end-start <= 3) {
            double sum = 0;
            for (int i=start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighted: " + i);
                sum += weights[i];
            }
            return sum;
        } else {
            int middle = start + ((end-start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            RecursiveTask<Double> otherTask = new WeighAnimalTask(weights, start, middle);
            otherTask.fork();
            return new WeighAnimalTask(weights, middle, end).compute() + otherTask.join();
        }
    }
    
    public static void main(String[] args) {
        Double[] weights = new Double[10];
        
        ForkJoinTask<Double> task = new WeighAnimalTask(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("Sum: " + sum);
    }
}

/* Identifying Fork/Join Issues
*
* Tips for Reviewing a Fork/Join Class
* The class should extend RecursiveAction or RecursiveTask.
* If the class extends RecursiveAction, then it should override a protected compute() method takes no argument and returns void
* If the class extends RecursiveTask, then it should override a protected compute() method that takes no arguments and returns a generic type listed in the class definition
* The invokeAll() method takes two instances of the fork/join class and does not return a result
* The fork() method causes a new task to be submitted to the pool and is similar to the thread executor submit() method.
* The join() method is called after the fork() method and causes the current thread to wait for the results of a subtask.
* Unlike fork(), calling compute() within a compute() method causes the task to wait for the results of the subtask.
* The fork() method should be called before the current thread performs a compute() operation, with join() called to read the results afterward.
* Since compute() takes no argument, the constructor of the class is often used to pass instructions to the task.
*/