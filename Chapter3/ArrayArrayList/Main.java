/* Arrays and ArrayList
*
* Arrays.asList uses its static ArrayList implementation 
* passing an array to Arrays.asList then changing the value via List
* will change the value in array like how the usual
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // empty list
        list.add("Fluffy");                     // [Fluffy]
        list.add("Webby");                      // [Fluffy, Webby]
        
        String[] array = new String[list.size()]; // empty array
        array[0] = list.get(1);                 // [Webby]
        array[1] = list.get(0);                 // [Webby, Fluffy]
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "-");
        }
        
        String[] array1 = {"gerbil", "mouse"};              // [gerbil, mouse]
        List<String> list1 = Arrays.asList(array1); // returns fixed list
        list1.set(1, "test");                      // [gerbil, test] 
        array1[0] = "new";                         // [new, test]
        String[] array2 = (String[]) list1.toArray();  // [new, test]
        list1.remove(1);                           // throws UnsupportedOperationException
    }
    
}