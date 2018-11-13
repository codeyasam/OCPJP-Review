/* Consumer and BiConsumer 
*
* You use a consumer when you want to do something with a parameter but not return anything.

defined as follows:
@FunctionalInterface public class Consumer<T> {
    void accept(T t);
}

@FunctionalInterface public class BiConsumer<T, U> {
    void accept(T t, U u);
}
*/

import java.util.Map;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class Main {
    
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        
        c1.accept("Annie");
        c2.accept("Annie");
        
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);
        
        Map<String, String> map2 = new HashMap<>();
        BiConsumer<String, String> b3 = map2::put;
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);
        
        b3.accept("chicken", "Cluck");
        b4.accept("chick", "Tweep");
        System.out.println(map2);
    }
    
}