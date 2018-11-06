/* Legacy Code: Compiler warnings
*/

import java.util.List;
import java.util.ArrayList;

class Dragon {}

class Unicorn {}

class LegacyDragons {
    
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());      // compiler warning: uses unchecked or unsafe operations
        printDragons(unicorns);           // compiler warning: uses unchecked or unsafe operations
    }
    
    private static void printDragons(List<Dragon> dragons) {
        for (Dragon dragon: dragons) {    // throws class cast exception
            System.out.println(dragon);
        }
    }
}

class LegacyDragons2 {
    
    public static void main(String[] args) {
        java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
        addUnicorn(unicorns);   
        Unicorn unicorn = unicorns.get(0);   // throws class cast exception
    }
    
    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());           // compiler warning: uses unchecked or unsafe operations    
    }
    
}