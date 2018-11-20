/* Using Common Intermediate Operations 
*
* deals with infinite streams by returning infinite streams
*/

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) {
        // filter()
        // method signature: Stream<T> filter(Predicate<? super T> predicate)
        
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);
        
        // filter with infinite stream
        Stream<String> s2 = Stream.generate(() -> "monkey");
        //s2.filter(x -> x.startsWith("m")).forEach(System.out::println); // will print monkey until program termination
        
        // distinct () - returns a stream with dup values removed
        // method signature: Stream<T> distinct()
        Stream<String> s3 = Stream.of("w", "w", "o", "l", "l", "f");
        s3.distinct().forEach(System.out::println);
        
        // limit() and skip() - make a Stream smaller
        // method signature:
        //     Stream<T> limit(int maxSize);
        //     Stream<T> skip(int n);
        Stream<Integer> s4 = Stream.iterate(1, n -> n + 1);
        s4.skip(5).limit(2).forEach(System.out::println); // 6 7
    
        // map() - creates one to one mapping from the elements of the stream to the elements of the next step in the stream.
        // method signature: <R> Stream<R> map(Function<? super T, ? extends R> mapper)
        
        Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
        s5.map(String::length).forEach(System.out::println);
        
        // flatMap() - method takes each element in the stream and makes any elements it contains top level elements in a single stream
        //method signature: <R> Stream<R> flatMap(Function<? super T,   ? extends Stream<? extends R>> mapper)
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "BabyGorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
       
        // sorted() - method returns a stream with the elements sorted
        // method signature: 
        //     Stream<T> sorted()
        //     Stream<T> sorted(Comparator<? super T> comparator)
        Stream<String> s7 = Stream.of("brown-", "bear-");
        s7.sorted().forEach(System.out::print);
        System.out.println();
        
        Stream<String> s8 = Stream.of("brown-", "bear-");
        s8.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        // peek() - It is useful for debugging because it allows us to perform stream operation without actually changing the stream
        // method signature: Stream<T> peek(Consumer<? super T> action)
        
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(x -> x.startsWith("g"))
            .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }
    
}
