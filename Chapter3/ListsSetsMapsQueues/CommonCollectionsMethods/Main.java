/* Common Collections Methods
*
* add() - inserts a new element into the Collection and returns whether it was successful. 
  method signature: boolean add(E element)
* remove() - removes a single matching value in the Collection and returns whether it was successful
  method signature: boolean remove(Object object)
* isEmpty() and size() - look at how many elements are in the Collection.
  method signature: boolean isEmpty()
                    int size()
* clear() - provides an easy way to discard all elements of the Collection. 
  method signature: void clear()
* contains() - checks if a certain value is in the Collection. This method calls equals() on each element of the ArrayList to see if there are any matches
  method signature: boolean contains(Object object)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();   // allows duplicates
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true
        
        Set<String> set = new HashSet<>();      // does not allow duplicates 
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false
        
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                           // [hawk]
        birds.add("hawk");                           // [hawk, hawk]
        System.out.println(birds.remove("cardinal"));  // false
        System.out.println(birds.remove("hawk"));    // true
        System.out.println(birds);                   // [hawk]
        //birds.remove(100);                           // throws an IndexOutOfBoundsException
        
        birds = new ArrayList<>();
        System.out.println(birds.isEmpty());         // true
        System.out.println(birds.size());            // 0
        System.out.println(birds.add("hawk"));       // [hawk]
        System.out.println(birds.add("hawk"));       // [hawk, hawk]
        System.out.println(birds.isEmpty());         // false
        System.out.println(birds.size());            // 2
    
        birds = new ArrayList<>();
        birds.add("hawk");                           // [hawk]
        birds.add("hawk");                           // [hawk, hawk]
        System.out.println(birds.isEmpty());         // false
        System.out.println(birds.size()) ;           // 2
        birds.clear();                               // []
        System.out.println(birds.isEmpty());         // true
        System.out.println(birds.size());            // 0
        
        birds = new ArrayList<>();
        birds.add("hawk");                           // [hawk]
        System.out.println(birds.contains("hawk"));  // true
        System.out.println(birds.contains("robin")); // false
    }
    
}