/* Map

* Methods
* void clear()              Removes all keys and values from the map
* boolean isEmpty()         Returns whether the map is empty
* int size()                Returns the number of entries (key/value pairs) in the map
* V get(Object key)         Returns the value mapped by key or null if none is mapped
* V put(K key, V value)     Adds or replaces key/value pair. Returns previous value or null
* V remove(Object key)      Removes and returns value mapped to key. Returns null if none.
* boolean containsKey(Object key)  Returns whether key is in map.
* boolean containsValue(Object value)  Returns value is in map.
* Set<K> keySet()           Returns set of all keys.
* Collection<V> values()    Returns Collections of all values
*/

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
        // using HashMap - not in order since it uses hashCode
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); //bamboo
        for (String key: map.keSet()) {
            System.out.print(key + ",") // koala,girrafe,lion,
        }
        
        // TreeMap - sorts the keys as we would expect. If we were to have called values() instead of keySet(), the order of the values would correspond to the order of the keys.
        map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.println(key + ","); // giraffe,koala,lion,
        
        System.out.println(map.contains("lion")); // DOES NOT COMPILE - contains is a method on the Collection interface but NOT the Map interface
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsKey("lion")); // false
        System.out.println(map.size());              // 3
    }
    
}