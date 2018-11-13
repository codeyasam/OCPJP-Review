/* Predicate and BiPredicate 
*
* Predicate is often used when filtering or matching. A BiPredicate is just like a Predicate except that it takes two parameters instead of one.

* defined as follows:
@FunctionalInterface public class Predicate<T> {
    boolean test(T t);
}

@FunctionalInterface public class BiPredicate<T, U> {
    boolean test(T t, U u);
}
*/

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class Main {
    
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
        
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
            
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
        
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        
//        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
//        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        
        // a better way to deal with this situation is to use two of the default methods on Predicate
        
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());
    }
    
}
