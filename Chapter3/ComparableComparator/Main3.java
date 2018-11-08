/* Comparable Comparator: Searching and Sorting
*/

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    
    static class Rabbit {
        int id;
    }
    
    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        //Collections.sort(rabbits);  // DOES NOT COMPILE - java knows that the Rabbit class is not Comparable.
    
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
        
        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c1 = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c1);
        System.out.println(index);    // -1      names is in ascending order and the sort is search is requiring a reversed Order
        
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles", 1));
        
        Set<Rabbit> rabbits1 = new TreeSet<>(new Comparator<Rabbit>() {
            public int compare(Rabbit r1, Rabbit r2) {
                return r1.id - r2.id;
            } 
        });
        rabbits1.add(new Rabbit());
        
        Set<Rabbit> rabbits2 = new TreeSet<>();
        rabbits2.add(new Rabbit());    // throws a ClassCastException: comparing.Rabbit cannot be cast to java.lang.Comparable s
    }                                  // since Rabbit does not implement Comparable
    
}