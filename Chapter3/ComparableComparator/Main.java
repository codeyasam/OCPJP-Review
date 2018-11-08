/* Comparable vs Comparator
*
* Remember: numbers sort before letters and uppercase letters sort before lowercase letters
*
* Comparable Interface: is to be implemented inside the object being compared: compareTo
* Comparator Interface: to sort objects that did not implement Comparable, or you want to sort objects in a different way than how it was implemented

* compareTo() 
* The number zero is returned when the curren object is equal to the argument to compareTo()
* A number less than zero is returned when the current object is smaller than the argument to compareTo()
* A number greater than zero is returned when the current object is larger than the argument to compareTo() 

* NOTE: compareTo() and equals() must be consistent - better practice

* Differences:                                           Comparable         Comparator
* Package name                                           java.lang          java.util
* Interface must be implemented by class comparing?      Yes                No
* Method name in interface                               compareTo          compare
* Number of parameters                                   1                  2
* Common to declare using a lambda                       No                 Yes
*/

import java.util.Comparator; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    public static void main(String[] args) {
        
        // Comparable
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 1));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);         // sort by name
        System.out.println(ducks);       // [Puddles, Quack]
        
        // Comparable
        Animal animal1 = new Animal(5);
        Animal animal2 = new Animal(7);
        System.out.println(animal1.compareTo(animal2)); // -2 
        System.out.println(animal2.compareTo(animal2)); // 0
        System.out.println(animal2.compareTo(animal1)); // 2
        
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck duck1, Duck duck2) {
                return duck1.getWeight() - duck2.getWeight();
            }  
        };
        
        List<Duck> ducks2 = new ArrayList<>();
        ducks2.add(new Duck("d1", 10));
        ducks2.add(new Duck("d2", 1));
        Collections.sort(ducks2);
        System.out.println(ducks2);
        Collections.sort(ducks2, byWeight);
        System.out.println(ducks2);
        Collections.sort(ducks2, (d1, d2) -> d1.getWeight() - d2.getWeight());
    } 
    
}

class Duck implements Comparable<Duck> {
    
    private String name;
    private int weight;
    
    public Duck(String name, int weight) { 
        this.name = name;
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
 
    @Override
    public String toString() {    // use readable output
        return name; 
    }   
    
    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }
    
}

class Animal implements Comparable<Animal> {
    
    private int id;
    
    public Animal(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Animal animal) {
        return id - animal.id;
    }
    
}