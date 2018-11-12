/* Q24: Which of the following compiles and print outs the entire set? */

import java.util.Set;
import java.util.HashSet;

public class Q24 {
    
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(System.out::println);
//        s.forEach((s) -> System.out.println(s)); // s is already defined!
    }
    
}