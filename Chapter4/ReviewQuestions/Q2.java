/* Q2: What is the output of the following? 
*
* F. The code hangs.
*/

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q2 {
    
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);  // will hang
        System.out.println(b1 + " " + b2);
    }
    
}