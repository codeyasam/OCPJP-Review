/* Looping Through a Collection
*/

import java.util.List;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Annie", "Ripley");
        // traditional way
        for(String cat: cats) {
            System.out.println(cat);
        }
        
        // lambda in one line
        cats.forEach(c -> System.out.println(c));
        
        // method reference
        cats.forEach(System.out::println);
    }
    
}