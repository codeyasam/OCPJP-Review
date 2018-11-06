/* Lower-Bounded Wildcards
* 
* Write a method that adds a string quack to two lists
*/

import java.util.List;
import java.util.ArrayList;

public class Main5 {
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings); // a copy of the list, different object and object reference
        addSound(strings);  // [tweet, quack]
        addSound(objects);  // [tweet, quack]
        System.out.println(strings);
        System.out.println(objects);
    }
    
    public static void addSound(List<? super String> list) {
        list.add("quack");
    }
    
}

/* Note: 
* unbounded && upperbounded are immutable
* with generics, must pass the exact match
* lowebounded has access to the methods and are immutable
*/