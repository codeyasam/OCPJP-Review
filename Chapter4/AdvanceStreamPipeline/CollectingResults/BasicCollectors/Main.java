/* Collecting Using Basic Collectors */

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);
        //String result2 = ohMy.collect(Collectors.joining("| ")); // stream has already been operated or closed   
        
        // Find the average length of three animal names
        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);  // 5.333333333
        
        // express using stream then convert to a collection
        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy.filter(s -> s.startsWith("t"))
            .collect(Collertors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]
    }
    
}