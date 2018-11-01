/* Q19: What is the result of the following code?
*/

class Swimmer {
    enum AnimalClasses {  // each enum that don't implement hasFins won't compile since it is an abstract method
        MAMMAL, FISH {
            public boolean hasFins() { return true; }
        }, BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;
        public abstract boolean hasFins(); 
    }
    
    public static void main(String[] args) {
        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
        System.out.println(AnimalClasses.FISH.hasFins());
        System.out.println(AnimalClasses.BIRD.hasFins());
    }
}