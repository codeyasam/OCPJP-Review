/* Removing Conditionally: using removeIf
* method signature: boolean removeIf(Predicate<? super E> filter)
*/

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);
    }
    
}

