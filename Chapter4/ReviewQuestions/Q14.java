/* Q14: Which of the follwoing is true?  
*
* D. compiler error on: Stream<Integer> s2 = ds.mapToInt(x -> x) 
*/

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

public class Q14 {
    
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
        Stream<Integer> s2 = ds.mapToInt(x -> x); // compiler error
        s2.forEach(System.out::println);
    }
    
}