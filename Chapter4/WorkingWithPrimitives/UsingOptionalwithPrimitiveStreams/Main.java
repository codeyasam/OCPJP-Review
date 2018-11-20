/* Using optional with Primitive Streams 
* 
*  Optional types for primitives
*                             OptionalDouble              OptionalInt               OptionalLong
* Getting as a primitive      getAsDouble()               getAsInt()                getAsLong()
* orElseGet()                 DoubleSupplier              IntSupplier               LongSupplier
  parameter type
* Return type of max()        OptionalDouble              OptionalInt               OptionalLong
* Return type of sum()        double                      int                       long
* Return type of average()    OptionalDouble              OptionalDouble            OptionalDouble
*/

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.OptionalDouble;

public class Main {
    
    public static void main(String[] args) {
        IntStream stream = Intstream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();
        
        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));
        
        // getAsDouble() rather than get()
        // ElseGet() takes a DoubleSupplier instead of Supplier
        
        
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum);
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // runs infinitely
    }
    
}