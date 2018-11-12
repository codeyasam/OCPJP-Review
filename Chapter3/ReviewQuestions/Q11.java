/* Q11: What is the result of the following code? */

import java.util.Map;
import java.util.HashMap;

public class Q11 {
    
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(10);
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.get(4));  // returns 16 because 16 is the value of the key of 4
    }
    
}