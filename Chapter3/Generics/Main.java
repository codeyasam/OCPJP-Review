/* Generics
*/

public class Main {
    
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
        
        Crate<Zebra> crateForZebra = new Crate<>();
        
        Robot robot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(robot);
        
        // ship to St. Louis
        Robot atDestination = robotCrate.emptyCrate();
    }
    
}

/*
* The generic type T is available anywhere within the Crate class. When you instantiate the class,
* you tell the compiler what T should be for that particular instance.
*/

class Crate<T> {
    
    private T contents;
    
    public T emptyCrate() {
        return contents;
    }
    
    public void packCrate(T contents) {
        this.contents = contents;
    }
}


class Elephant {}

class Zebra {}

class Robot {}