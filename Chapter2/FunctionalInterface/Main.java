/* Functional Interface
*
* contains exactly one abstract method
*/

@FunctionalInterface
interface Sprint {
    public void sprint(Animal animal);
}

class Animal {}

class Kangaroo {}

class Tiger implements Sprint {
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast: " + animal.toString());
    }
}

// examples of functional interfaces

interface Run extends Sprint {}

interface SprintFaster extends Sprint {
    
    public void sprint(Animal animal);
    
}

interface Skip extends Sprint {
    public default int getHopCount(Kangaroo kangaroo) { return 10; }
    public static void skip(int speed) {}
}