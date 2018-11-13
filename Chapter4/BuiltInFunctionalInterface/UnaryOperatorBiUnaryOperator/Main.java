/* UnaryOperator and BinaryOperator 
*
* are a special case of a function. They require all type parameters to be the same type. 

* defined as the following:
@FunctionalInterface public class UnaryOperator<T> extends Function<T, T> {}
@FunctionalInterface public class BinaryOperator<T> extends BiFunction<T, T, T> {}

this means that method signatures look like this:
T apply(T t)
T apply (T t1, T t2)
*/

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class Main {
    
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        
        System.out.println(u1.apply("chirp")); //prints CHIRP
        System.out.println(u2.apply("chirp")); //prints CHIRP
        
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
    
}