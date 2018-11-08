/* Additions in Java 8: Method references
*
* are a way to make the code shorter by reducing some of the code that can be inferred and simply mentioning the name of the method. Like Lambdas, it takes time 
* to get used to the new syntax.
*/

import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) {
        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2); // not bad. but there's a bit of redundancy
        Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;   // returns a functional interface
                                                                    // :: is like lambdas, and it is typically used for deferred execution
    }
    
}

interface DuckHelper {   // this could be a class or an interface
    
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }
    
    public static int compareByName(Duck d1, Duck d2) {
        return d2.getName().compareTo(d2.getName());
    }
    
}

class Duck {
    
    private String name;
    private int weight;
    
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
}