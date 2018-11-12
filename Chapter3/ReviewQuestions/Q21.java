/* Q21: Fill in the blanks to make this code compile and print 123. */

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Q21 {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Iterator iter = list.iterator();
        while(iter.hasNext())
            System.out.print(iter.next());
    }
    
}