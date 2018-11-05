/* Searching and Sorting
*/

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] numbers = {6,9,1,8};
        Arrays.sort(numbers);     //sorts the array [1,6,9,8]
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
    }
    
}