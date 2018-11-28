/* Understanding Memory Consistency Errors 

* The purpose of the concurrent collection classes is to solve common memory consistency errors.
* Memory Consistency Errors occurs when two threads have inconsistent views of what should be the same data. 
*/

import java.util.Map;
import java.util.HashMap;
import java.util.ConcurrentHashMap;

public class Main {
    
    public static void main(String[] args) {
        // When two threads try to modify the same non-concurrent collection, the JVM may throw a ConcurrentModificationException at runtime. In fact, it can happen with a single thread. 
        Map<String, Object> foodData = new HashMap<String, Object>();
        //Map<String, Object> foodData = new ConcurrentHashMap<>();  // will prevent ConcurrentModificationException
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key: foodData.keySet()) {
            foodData.remove(key); // will throw a ConcurrentModificationException - since the iterator keySet() is not properly updated after the first element is removed.
        }
        System.out.println(foodData);
    }
    
}