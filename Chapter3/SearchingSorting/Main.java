/* Searching and Sorting
*
* Arrays.sort - sort the passed array
* [1, 6, 9, 8]
* Arrays.binarySearch(numbers, 6) - returns the index if exists
* Arrays.binarySearch(numbers, 3) - not exists - return one less than the negated index of where the requested value would need to be inserted.

* Collections.sort - same behavior with Arrays
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        int[] numbers = {6,9,1,8};
        Arrays.sort(numbers);     //sorts the array [1,6,9,8]
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
    
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list);  // [3, 5, 7, 9]
        System.out.println(Collections.binarySearch(list, 3)); // 0
        System.out.println(Collections.binarySearch(list, 2)); // -1
    }
    
}