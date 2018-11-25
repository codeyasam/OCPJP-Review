/* Introducing Callable 
*
* java.util.concurrent.Callable

* Similar to Runnable except that its call() method returns a value and can throw a checked exception. 

* Definition of the Callable interface:
@FunctionalInterface public interface Callable {
    V call() throws Exception;
}

* The Callable interface was introduced as an alternative to the Runnable interface, since it allows more details to be retrieved easily from the task after it is completed. The ExecutorService includes an overloaded version of the submit() method that takes a Callable object and returns a generic Future<T> object.    

// Ambiguous Lambda Expression: Callable vs Supplier
*/

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.io.IOException;

class AmbiguousLambdaExpression {
    
    public static void useCallable(Callable<Integer> expression) {
    }
    
    public static void useSupplier(Supplier<Integer> expression) {
    }
    
    public static void use(Callable<Integer> expression) {}
    public static void use(Supplier<Integer> expression) {}
    
    public static void main(String[] args) {
        
        useCallable(() -> { throw new IOException(); });  // COMPILES
        //useSupplier(() -> { throw new IOException(); });  // DOES NOT COMPILE
        //use(() -> { throw new IOException(); }); // DOES NOT COMPILE - reference to use is ambiguous
        
        use((Callable<Integer>) () -> { throw new IOException(); });
    }
    
}

// get method in Callable
