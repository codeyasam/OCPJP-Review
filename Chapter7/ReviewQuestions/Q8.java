/* Q8: What statements about the following code are true? (Choose all that apply.) 
*
Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();
synchronized(i1) {   // y1
    Integer i2 = Arrays.asList(6,7,8,9,10)
        .parallelStream()
        .sorted()         // y2
        .findAny().get(); // y3
    System.out.println(i1 + " " + i2);
}
*
*
* G. The output cannot be determined ahead of time.
*/

import java.util.Arrays;

public class Q8 {
    
    public static void main(String[] args) {
        Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();
        synchronized(i1) {
            Integer i2 = Arrays.asList(6,7,8,9,10)
                .parallelStream()
                .sorted()
                .findAny().get();
            System.out.println(i1 + " " + i2);
        }
    }
    
}