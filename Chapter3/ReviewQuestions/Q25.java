/* Q25: What is theresult of the following? */

import java.util.Map;
import java.util.HashMap;

public class Q25 {
    
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        
        map.merge(1, 3, (a,b) -> a + b);
        System.out.println(map);

        map.merge(3, 3, (a,b) -> a + b);
        System.out.println(map);
    }
    
}