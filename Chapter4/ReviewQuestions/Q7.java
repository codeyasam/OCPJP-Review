/* Q7: We have a method that returns a sorted list without changing the original. Which of the following can replace the method implementation
to do the same with streams 

* F. return list.stream()
                .sorted((a, b) b.compareTo(b))
                .collect(Collectors.toList());
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Q7 {
    
    public static void main(String[] args) {
        
    }
    
    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a)); // reversed
        return copy;
    }
    
    
    
}