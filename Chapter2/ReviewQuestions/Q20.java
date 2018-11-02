/* Q20: Choose the correct statement about the following code:
*
* It compiles without issue.
*/

interface CanFly {
    void fly();
}

interface HasWings {
    public abstract Object getWingSpance();
}

abstract class Falcon implements CanFly, HasWings {
    
}