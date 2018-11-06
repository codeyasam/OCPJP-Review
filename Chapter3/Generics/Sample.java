/* This code throws a ClassCastException
*/

import java.util.List;
import java.util.ArrayList;

public class Sample {
    
    public static void main(String[] args) {
        List names = new ArrayList();
        // names.add(new String("sample"));      // compiler warning: anything you pass will result in compiler warning since it's not using generics
        names.add(new StringBuilder("Webby")); // compiler warning: uses unchecked or unsafe operations
        printNames(names);
    }
    
    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // class cast exception here (Runtime Exception)
            System.out.println(name);
        }
    }
}