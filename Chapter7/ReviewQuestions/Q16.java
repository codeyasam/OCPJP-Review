/* Q16: What is the result of executing the following application? (Choose all that apply.) 
*
* F. It compiles but the output cannot be determined ahead of time.
* H. It compiles but waits forever at runtime.             (since the ExecutorService is never been shutdown)
*/

import java.util.concurrent.*;
import java.util.stream.*;

public class PrintConstants {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159, 2.71828) // b1
            .forEach(c -> service.submit( // b2
                () -> System.out.println(10 * c)));  // b3
        service.execute(() -> System.out.println("Printed")); // b4
    }
}