/* Common Terminal Operations 
* 
* Reductions are a special type of terminal operation where all of the contents of the stream are combined into a single primitive or Object.
* Terminal Stream operations
* Method                        What Happens for Infinite Streams         Return Value            Reduction
* allMatch()                    Sometimes terminates                      boolean                 No
/anyMath()
/noneMatch()
* collect()                     Does not terminate                        Varies                  Yes
* count()                       Does not terminate                        long                    Yes
* findAny()                     Terminates                                Optional<T>             No
/findFirst()       
* forEach()                     Does not terminate                        void                    No
* min()/max()                   Does not terminate                        Optional<T>             Yes
* reduce()                      Does not terminate                        Varies                  Yes
*/

import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        // count() - determines the number of elements in a finite stream. 
        // method signature: long count()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
        
        // min() and max() - allows yo uto pass a custom comparator and find the smallest or largest value in a finite stream.
        // method signature: Optional<T> min(<? super T> comparator);
        // method signature: Optional<T> max(<? super T> comparator);
        
        Stream<String> s1 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s1.min((string1, string2) -> string1.length() - string2.length());
        min.ifPresent(System.out::println); // ape
        
        Optional<?> minEmpty = Stream.empty().min((string1, string2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
        
        // findAny and findFirst 
        // method signature: 
        //        Optional<T> findAny()
        //        Optional<T> findFirst()
        
        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s2.findAny().ifPresent(System.out::println);        // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
        
        // allMatch(), anyMatch(), and noneMatch()
        // method signatures: 
        //         boolean anyMatch(Predicate<? super T> predicate)
        //         boolean allMatch(Predicate<? super T> predicate)
        //         boolean noneMatch(Predicate<? super T> predicate)
        
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().anyMatch(pred)); // false
        System.out.println(list.stream().anyMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred));// false
        System.out.println(infinite2.anyMatch(pred));      // true
        
        // forEach()
        // method signature: void forEach(Consumer<? super T> action)
        Stream<String> s3 = Stream.of("Monkey", "Gorilla", "Bonobo");
        s3.forEach(System.out::print);  // MonkeyGorillaBonobo 
        //s3.forEach(System.out::print);  // IllegalStateException: stream has already been operated upon or closed
    
        Stream<Integer> s4 = Stream.of(1);
        // for (Integer i: s4) {} // DOES NOT COMPILE
        
        // reduce() method combines a stream into a single object. A reduction.
        // method signatures: T reduce(T identity, BinaryOperator<T> accumulator)
        //                    Optional<T> reduce(BinaryOperator<T> accumulator)
        //                    <U> U reduce(U identitym BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
        
        // concatenate an array of strings without functional programming
        String[] array  = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s5: array) result += s5;
        System.out.println(result);
        
        // using stream and reduction
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s7, c7) -> s7 + c7);
        System.out.println(word);
        
        // rewrite using method reference
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", String::concat);
        System.out.println(word2);
        
        Stream<Integer> stream3 = Stream.of(3, 5, 6);
        System.out.println(stream3.reduce(1, (a, b) -> a * b));
        
        // omitting the identity
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        
        empty.reduce(op).ifPresent(System.out::print);  // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
        
        Stream<Integer> stream4 = Stream.of(3, 5, 6);
        System.out.println(stream4.reduce(1, op, op)); // 90
        
        // collect() is a special type of reduction called a mutable reduction
        // method signature: <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
        // <R, A> collect(Collector<? super T, A, R> collector)
        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        StringBuilder word5 = stream5.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word5);
        
        Stream<String> stream6 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream6.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set); // sorted but reversed
        
        Stream<String> stream7 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream7.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2);
        
        Stream<String> stream8 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream8.collect(Collectors.toSet());
        System.out.println(set3);
    }
    
}