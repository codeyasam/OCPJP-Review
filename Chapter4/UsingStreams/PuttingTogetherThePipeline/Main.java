/* Putting Together the Pipeline 
*
* Let's say that we wanted to get the first two names alphabetically that
* are four characters long. 
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        // In Java 7
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name: list) {
            if (name.length() == 4) 
                filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        System.out.println(filtered);
        if (iter.hasNext()) System.out.println(iter.next());
    
        // on java 8
        list.stream()
            .filter(n -> n.length() == 4)
            .sorted()
            .limit(2)
            .forEach(System.out::println);
        
    }
    
}