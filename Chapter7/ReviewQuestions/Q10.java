/* Q10: What statements about the following code are true? (Choose all that apply.) 
*
System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
    .parallelStream().parallel()   //q1
    .reduce(0, 
        (c1, c2) -> c1.length() + c2.length(), // q2
        (s1, s2) -> s1 + s2)); // q3
        
* C. The code will not compile because of line q2.        
*/

import java.util.Arrays;

public class Q10 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")
                          .parallelStream().parallel()
                          .reduce(0,
                                 (c1, c2) -> c1.length() + c2.length(), // c1 is of type Integer - doesn't have .length()
                                 (s1, s2) -> s1 + s2));
    }
    
}