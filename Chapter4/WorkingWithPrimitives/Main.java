/* Working with primitives 
*
* with streams there are also equivalents that work with the int, double, long primitives.
*/

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class Main {
    
    public static void main(String[] args) {
        // Suppose we want to calculate the sum of numbers in a finite stream
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n);
        
        // another way: converted our Stream<Integer> to an IntStream and asked the IntStream to calculate the sum
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum());
        
        // compute average
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());
    }
    
}