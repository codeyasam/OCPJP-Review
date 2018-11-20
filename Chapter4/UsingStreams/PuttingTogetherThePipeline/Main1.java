/* What do the following does? */

import java.util.stream.Stream;
    
public class Main1 {
    
    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            .sorted()   // waits until everyting to sort is present
            .limit(2)
            .forEach(System.out::println);
        
        Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            .limit(2)
            .sorted()
            .forEach(System.out::println); // prints Elsa twice
        
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
            .filter(x -> x % 2 == 1)       // first five 1 2 3 4 5
            .forEach(System.out::println); // 135
        
        Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
        infinite1.limit(5)
            .peek(System.out::println)  
            .filter(x -> x % 2 == 1)
            .forEach(System.out::println); // 11233455
        
        Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.filter(x -> x % 2 == 1)
            .limit(5)
            .forEach(System.out::println); // 13579
        
        Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
        infinite3.filter(x -> x % 2 == 1)
            .peek(System.out::println)
            .limit(5)
            .forEach(System.out::println); // 1133557799
    }
    
}