/* Q6: Which of the following can fill in the blank so that the code prints out false? (Choose all that apply) 
*
* A. allMatch - returns false immediately because it doesn't match
*/

import java.util.stream.Stream;

public class Q6 {
    
    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty); // false
        System.out.println(match);
    }
    
}