/* Collecting using Grouping, Partitioning and Mapping */

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        // grouping
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    
        // downstream collector: store it in a set instead of a List
        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2);
        
        // change the type of map to TreeMap but leave the type of values alone to as a List
        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map3);
        
        // Partitioning - like splitting a list into two parts
        // suppose we have two sizes of signs: names with 5 or fewer characters, longer than 5 characters
        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map4 = ohMy4.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map4); 
        
        // Now suppose 7 characters can now fit on the smaller sign
        Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map5 = ohMy5.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map5);
        
        // as with groupingBy, we can change the type of List to something else
        Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map6 = ohMy6.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map6);   
        
        // unlike groupingBy we cannot change the type of Map, though there are only  two keys in the map, so it doesnt really matter
        
        // we can group by the length of the animal name to see how many of each length we have
        Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map7 = ohMy7.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map7);
        
        // Mapping
        // Suppose that we wanted to get the first letter of the first animal alphabetically of each length.
        Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map8 = ohMy8.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.mapping(s -> s.charAt(0),
                    Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(map8);
    }
    
}