/* Polymorphic Property
*
* The important thing to note here is that only one object, Lemur, is created and referenced.
* The ability of the Lemur object to be passed around as an instance of an interface it implements, HasTail, as well as an instance of one if 
* its superclasses, Primate, is the nature of polymorphism
*/

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

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);             // prints 10
        
        HasTail hasTail = lemur;
        System.out.println(lemur.isTailStriped()); // prints false
        
        Primate primate = lemur;
        System.out.println(lemur.hasHair());       // prints true
    }
}