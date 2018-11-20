/* Collecting into Maps */

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
        
        // do the reverse
        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map2); // {5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); // class java.util.HashMap
        
        // suppose that we want to mandate that the code return a TreeMap
        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy3.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map3);
        System.out.println(map3.getClass()); // class java.util.TreeMap
    }
    
}