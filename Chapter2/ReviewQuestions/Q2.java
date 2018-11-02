/* Q2: What is the result of the following code?
*
*/

interface CanClimb {
    public abstract void climb();
}

interface CanClimbTrees extends CanClimb {}

abstract class Chipmunk implements CanClimbTrees {
    public abstract void chew();
}

class EasternChipmunk extends Chipmunk {  // won't compile - climb is not implemented
    public void chew() {
        System.out.println("Eastern Chipmunk is Chewing");
    }
}