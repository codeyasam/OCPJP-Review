
abstract class Animal {
    public void careFor() {
        play();
    }
    
    public void play() {
        System.out.println("pet animal.");
    }
}

class Lion extends Animal {
    public void play() {
        System.out.println("toss in meat.");
    }
}

/*
* careFor in Animal class executes 
* That method calls play
* Java looks for  overridden methods, and it sees that Lion implements play.
*/

public class PlayWithAnimal {
    public static void main(String... args) {
        Animal animal = new Lion();
        animal.careFor();
    }
}

