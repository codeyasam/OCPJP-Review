/* New Maps API Java 8
*/

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        
        favorites.put("Jenny", "Tram");
        System.out.println(favorites); // {Jenny=Tram}
        
        // putIfAbsent
        favorites = new HashMap<>();
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
        
        // merge
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        
        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        
        System.out.println(favorites);  // {Jenny=Bus Tour, Tom=Skyride}
        System.out.println(jenny);      // Bus Tour
        System.out.println(tom);        // Skyride
        
        // if nulls or missing keys are involved. It simply uses the new value
        favorites = new HashMap<>();
        favorites.put("Sam", null);
        favorites.merge("Tom", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        
        System.out.println(favorites);  // {Tom=Skyride, Sam=Skyride}
        
        // when mapping function returns null. The key is removed from the map when this happens
        mapper = (v1, v2) -> null;
        
        favorites - new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");
        
        favorites.merge("Jenny", "Skyride", mapper);  // jenny exists but mapper is null: removes jenny from the map
        favorites.merge("Sam", "Skyride", mapper);    // sam doesnt exists: adds sam to the map
        
        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}
        
        // computeIfPresent - calls the BiFunction if the requested key is found.
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        
        BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper2);
        Integer sam = counts.computeIfPresent("Sam", mapper2);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny);  // 2
        System.out.println(sam);    // null
        
        // computeIfAbsent - the functional interface runs only when the key is NOT present or is NULL:
        counts = new HashMap<>();
        counts.put("Jenny", 15);
        counts.put("Tom", null);
        
        Function<String, Integer> mapper3 = (k) -> 1;
        jenny = counts.computeIfAbsent("Jenny", mapper3);     // 15
        sam = counts.computeIfAbsent("Sam", mapper3);         // 1
        Integer tom = counts.computeIfAbsent("Tom", mapper3); // 1
        System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}
        
        counts = new HashMap<>();
        counts.put("Jenny", 1);
        counts.computeIfPresent("Jenny", (k, v) -> null);
        counts.computeIfAbsent("Sam", (k, v) -> null);
        System.out.println(counts) // {}
    }
    
}