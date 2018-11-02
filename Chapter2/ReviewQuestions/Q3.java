/* Q3: Which of the following are valid functional interface
*/

interface Climb {          // valid functional interface
    public int climb();
}

abstract class Swim {
    public abstract Object swim(double speed, int duration);
}

interface ArcticMountainClimb extends MountainClimb {
    public default int getSpeed();       // won't compile - default method in interfaces must have a body
}

interface MountainClimb extends Climb { // valid functional interface
    
}

