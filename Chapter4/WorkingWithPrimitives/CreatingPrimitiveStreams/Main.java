/* Creating Primitive Streams 
*
* Three types of primitive streams:
* IntStream: Used for the primitive types: int, short, byte, char
* LongStream: Used for the primitive type long
* DoubleStream: Used for the primitive types double and float
*/

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        // source for regular streams
        DoubleStream empty = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        oneValue.forEach(System.out::println);
        System.out.println();
        varargs.forEach(System.out::println);
        
        // methods for creating infinite streams
        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);
        
        // when dealing with int or long primitives, it is common to count.
        IntStream count = IntStream.iterate(1, n -> n + 1);
        count.forEach(System.out::pritnln);
        
        // java provides a method that can generate a range of numbers
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }
    
}