/* Set Interface
*
* You use a set when you don't want to allow duplicate entries.
*
* A HashSet stores its elements in a hash table. Thismeans that it uses the hashCode() method of the objects to retrieve them more efficiently.
* The main benefit is that adding elements and checking if an element is in the set both have constant time. The tradeoff is that you lose the order in which you
* inserted the elements. 

* The TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order. 
* The tradeoff is that adding and checking if an element is present are both O(log n).
* TreeSet implements a special interface called NavigableSet, Which lets you slice up the collection.
*/

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);           // true
        boolean b2 = set.add(10);           // true
        boolean b3 = set.add(66);           // false
        boolean b4 = set.add(8);            // true
        for (Integer integer: set) System.out.print(integer + ",");
    
        System.out.println();
        
        Set<Integer> treeSet = new TreeSet<>();
        b1 = treeSet.add(66);
        b2 = treeSet.add(10);
        b3 = treeSet.add(66);
        b4 = treeSet.add(8);
        for (Integer integer: treeSet) System.out.print(integer + ",");
    }
    
}