/* Casting Object References
*
* Casting an object from a subclass to a superclass doesnt require an explicit cast
* Casting an object from a superclass to a subclass requires an explicit cast
* The compiler will not allow casts to unrelated types
* Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actual instance
* to avoid class cast exception, make use of instanceof
*/

public class Main {
    
    public static void main(String[] args) {
        Lemur lemur = new Lemur();              
        Primate primate = lemur;
        
        Lemur lemur2 = primate;       // won't compile        
        Lemur lemur3 = (Lemur) primate;
        
        Fish fish = new Fish();
        Bird bird = (Bird) fish;      // won't compile
            
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent; // Will compile BUT will throw ClassCastException at Runtime
            
        /*avoid ClassCastException at runtime*/
        if (rodent instanceof Capybara) {
            Capybara capybara2 = (Capybara) rodent;
        }
    }
    
}

class Bird {
    
}

class Fish {
    
}

class Rodent {
    
}

class Capybara extends Rodent {
    
}

class Primate {
     public boolean hasHair() {
         return true;
     }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    
    public int age = 10;
    
    public boolean isTailStriped() {
        return false;        
    }
}

