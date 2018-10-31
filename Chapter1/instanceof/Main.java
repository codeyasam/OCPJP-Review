

/* instanceof B
*  the expression returns true if the reference to which a points is 
*
* an instance of class B
* a subclass of B (directly or indirectly)
* a class that implements the B interface (directly or indirectly)
*/

interface Mother {}

class HeavyAnimal {}

class Hippo extends HeavyAnimal {}

class Elephant extends HeavyAnimal {}

public class Main {
    
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;        // true
        boolean b2 = hippo instanceof HeavyAnimal;  // true
        boolean b3 = hippo instanceof Elephant;     // false
        
        /*
        * All Java Classes inherit from Object,  which means that x instanceof Object is usually true, 
        * except for one case where it is false. If the literal null or a variable reference pointing to null is used to check instanceof
        * the result is null.
        */
        
        HeavyAnimal hippo2 = new Hippo();
        boolean b4 = hippo2 instanceof Object;    // true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; // false
        
        /*
        * The compiler knows that there is no possible way for a Hippo variable reference to be an Elephant
        * 
        * The compilation check only applies when instanceof is called on a class. When checking wether an object is an
        * instanceof an interface, Java waits until runtime to do the check
        */
        
        // Hippo anotherHippo = new Hippo();
        // boolean b6 = anotherHippo instanceof Elephant; // DOES NOT COMPILE
        
        /* 
        * The compilation check only applies when instanceof is called on a class. When checking wether an object is an
        * instanceof an interface, Java waits until runtime to do the check
        *
        * The reason is that a subclass could implement that interface and the compiler wouldn't know it.
        */
        
        HeavyAnimal anotherHippo2 = new Hippo();
        boolean b7 = anotherHippo2 instanceof Mother;
        
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b7);
    }
    
}
