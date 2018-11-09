/* Method References: 4 formats
*
* Static Methods
* Instance methods on a particular instance
* Instance methods on an instance to be determined at runtime
* Constructors
*/

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collections;


public class Main2 {
    
    public static void main(String[] args) {
        // static method
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
        
        // instance method
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.starsWith(s);
    
        // instance method without knowing the instance in advance
        Predicate<String> methodRef3 = String::isEmpty();
        Predicate<String> lambda3 = s -> s.isEmpty();
        
        // constructor reference
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList<>();
    }
    
}