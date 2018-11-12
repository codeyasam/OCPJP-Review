/* Q20: What is the result of the following code? */

import java.util.Map;
import java.util.HashMap;


public class Q20 {
    
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");                // compile warning
        m.put("abc", "def");              // compile warning
        System.out.println(m.contains("123"));  //CONTAINS KEY! - compiler error
    }
    
}