/* Generics: Upperbounded wildcards
*
* We've established that a generic type can't just use a subclass
*
* The upper-bounded wildcard says that any class that extends Number or Number itslef can be used a s the formal parameter type

* The list becomes logically immutable: When working with upperbounds or unbounded wildcards
*/

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Integer>(); // WON'T COMPILE
        // Instead, we need to use a wildcard:
        List<? extends Number> anotherList = new ArrayList<Integer>();
    }
    
    // before type erasure
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list) {
            count += number.longValue();
        }
        return count;
    }
    
    // after type erasure
    public static long total2(List list) {
        long count = 0;
        for (Object obj: list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }
}

/*
* The problem stems from the fact that Java doesn't know what type List<? extends Bird> really is. 
* It could be List<Bird>, or List<Sparrow> or some other generic type that hasn't even beeen writen yet.
*/

class UpperboudedWildCard {
    
    static class Sparrow extends Bird {}
    static class Bird {}
    
    public static void main(String[] args) {
        List<? extends Bird> bird = new ArrayList<Bird>();
        birds.add(new Sparrow()); // WON'T COMPILE - we can't add Sparrow to a List of Birds
        birds.add(new Bird());    // WON'T COMPILE - we can't add Bird to a List of Sparrows
    }
    
}