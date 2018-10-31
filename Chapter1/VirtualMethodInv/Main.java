
/* Virtual Method Invocation
*
*
*
*/

abstract class Animal {
    String name = "???";
    
    public void printName() {
        System.out.println(name);
    }
    
    public abstract void feed();
}

class Cow extends Animal {
    public void feed() { addHay(); }
    public void addHay() { }
}

class Bird extends Animal {
    public void feed() { addSeed(); }
    public void addSeed() { }
} 

class Lion extends Animal {
    
    String name = "Leo";
    
    /*
    * Polymorphism at runtime
    */
    public void printName() {
        System.out.println(name);
    }
    
    public void feed() { addMeat(); }
    public void addMeat() {
        
    }
}

public class Main {
    
    /*
    * Java looks for an overriden method rather than necessarily using the one in the class that the compiler says we have. 
    * Java looked at the actual type of animal at runtime and called feed on that. 
    */
    
    public void feedAnimal(Animal animal) {
        animal.feed();
    }
    
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();
    }
    
}