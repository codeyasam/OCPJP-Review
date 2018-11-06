/* Generics: Bounds
*
* By now, you might have noticed that generics don't seem particularly useful since they are treated as Objects and therefore don't have many methods avaialble.
*
* bounded parameter types: is a generic type that specifies a bound for the generic. 
* wildcard generic type: is an unknown generic type represented with a question mark 

* Types of Bounds
* 
* Unbounded wildcard                 ?                List<?> l = new ArrayList<String>();
* Wildcard with an upper bound       ? extends type   List<? extends Exception> l = new ArrayList<RuntimeException>();  // is ? extends Exception?
* Wildcard with a lower bound        ? super type     List<? extends Exception> l = new ArrayList<Object>();            // is ? a super class of Exception?
*/

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);  // WONT COMPILE - List<String> cannot be assigned to List<Object> - because... GENERICS
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        List<Object> objects = numbers; // WONT COMPILE - List<Integer> cannot be assigned to List<Object> - because... GENERICS
        objects.add("forty two");
        System.out.println(numbers.get(1));
    }
    
    public static void printList(List<Object> list) {
        for (Object x: list) System.out.println(x);
    }
    
}