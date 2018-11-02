/* Functional Interface with Lambda
*
*/

import java.util.function.Predicate;

class Animal {
    
    private String species;
    private boolean canHop;
    private boolean canSwim;
    
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
    
}

@FunctionalInterface
interface CheckTrait {
    public boolean test(Animal a);
}

class FindMatchingAnimals {
    
    public static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }
    
    public static void main(String[] args) {
        print(new Animal("samp1", false, true), animal -> animal.canHop());
        print(new Animal("GrassHopper", true, false), animal -> animal.canHop());
    }
    
}

class FindMatchingAnimals2 {
    
    public static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }
    
    public static void main(String[] args) {
        print(new Animal("samp1", false, true), animal -> animal.canHop());
        print(new Animal("GrassHopper", true, false), animal -> animal.canHop());
    }
    
}