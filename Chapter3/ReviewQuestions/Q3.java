/* Q3: What is the result of the following statements? */

import java.util.List;
import java.util.ArrayList;

public class Q3 {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");            // compiler warning
        list.add("two");            // compiler warning
        list.add(7);                // compiler warning
        for (String s: list)        // won't compile - Object cannot be converted to String
            System.out.println(s);
    }
    
}