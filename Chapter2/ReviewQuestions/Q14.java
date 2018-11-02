/* Q14: Which of the following statements can be inserted in the blank line so that the code will compile successfully?
*/

interface CanHop {}

class Frog implements CanHop {
    public static void main(String[] args) {
        CanHop frog = new TurtleFrog();        // will compile
        Frog frog2 = new TurtleFrog();         // will compile
        TurtleFrog frog3 = new TurtleFrog();   // will compile
        Object frog4 = new TurtleFrog();       // will compile
    }
}

class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}

