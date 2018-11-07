/* Using the List interface
*
* void add(E element)                - Adds element to end
* void add(int index, E element)     - Adds element at index and moves the rest toward the end
* E get(int index)                   - Returns element at index
* int indexOf(Object o)              - Returns first matching index or -1 if not found
* int lastIndexOf(Object o)          - Returns last matching index or -1 if not found
* void remove(int index)             - Removes element at index and moves the rest toward the front (might throw IndexOutOfBoundsException)
* E set(int index, E e)              - Replaces element at index and returns original
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");                            // [SD]
        list.add(0, "NY");                         // [NY, SD]
        String orignalString = list.set(1, "FL");  // [NY, FL]
        System.out.println(list);
        System.out.println(orignalString);
        list.remove("NY");                         // [FL]
        list.remove(0);                            // []                 
        
        list = new ArrayList<>();
        list.add("OH");                            // [OH]
        list.add("CO");                            // [OH, CO]
        list.add("NJ");                            // [OH, CO, NJ]
        String state = list.get(0);                // OH
        int index = list.indexOf("NJ");            // 2
        
        // enhanced for loop
        for (String string: list) {
            System.out.println(string);
        }
        
        // before java 5
        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            String string = (String) iter.next();
            System.out.println(string);
        }
        
        // using generics
        Iterator<String> iter2 = list.iterator();
        while(iter2.hasNext()) {
            String string = iter2.next();
            System.out.println(string);
        }
    }
    
}