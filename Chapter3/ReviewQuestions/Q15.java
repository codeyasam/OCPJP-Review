/* Q15: What is the result of the following code? */

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Q15 {
    
    public static void main(String[] args) {
        Comparator<Integer> c = (o1, o2) -> o2-o1;
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        Collections.sort(list, c);
        System.out.println(Collections.binarySearch(list, 1)); // prints -1 - needs to be search in reverse since it is reversed
    }
    
}