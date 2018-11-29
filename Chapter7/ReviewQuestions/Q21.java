/* Q21: Assuming an implementation of the performCount() method is provided prior to runtime, which of the following are possible results of executing the following application? (Choose all that apply.)
*
* A. It outputs a number 10 times
* C. It outputs a null value 10 times
* D. It outputs Exception! 10 times
* E. It hangs indefinitely at runtime
*/

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class CountZooAnimals {
    public static Integer performCount(int exhibitNumber) {
    // IMPLEMENTATION OMITTED
    }
    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get()); // o1
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0, 10)
        .forEach(i -> results.add(
        service.submit(() -> performCount(i)))); // o2
        results.stream().forEach(f -> printResults(f));
        service.shutdown();
    }
}