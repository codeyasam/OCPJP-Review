/* What is the result of executing the following program? */

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

class PrintCounter {
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();
        IntStream.iterate(0, i -> i +1).limit(5).forEach(i -> results.add(service.execute(() -> counter++))); // n1 won't compile
        
        for (Future<?> result: results) {
            System.out.println(results.get() + " "); // n2
        }
        service.shutdown();
    }
}