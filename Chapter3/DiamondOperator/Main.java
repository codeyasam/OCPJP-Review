/* Diamond Operator
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        List names = new ArrayList(); // Before Java 5 came out
                                      // names were expected to contain String objects
                                     
        List<String> names2 = new ArrayList<String>(); // In java 5 - generics
    
        List<String> names3 = new ArrayList<>(); // In java 7 this is allowed
        
        HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();
        
        HashMap<String, HashMap<String, String>> map2 = new HashMap<>();
    }
    
}

class Doggies {
    List<String> names;
    
    Doggies() {
        names = new ArrayList<>();   // matches instance variable declaration
    }
    
    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>();  // matches local variable declaration
    }
}