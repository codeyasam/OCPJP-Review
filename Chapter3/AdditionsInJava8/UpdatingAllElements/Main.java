/* Updating All Elements: replaceAll
* method signature: void replaceAll(UnaryOperator<E> o)
* UnaryOperator takes one parameter and returns a value of the same type
*/

import java.util.function.UnaryOperator;
import java.util.List;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.replaceAll(x -> x*2);
        System.out.println(list); // [2, 4, 6]
    }
    
}