/* Q7: which of the following statement are true? */

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Q7 {
    
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));  // won't be added
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
            
        // will compile but the output is indeterminate due to the set not being in order
    }
    
}