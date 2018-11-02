/* Q10: What is the result of the following code?
*
* 
*/

interface CanWalk {
    default void walk() {
        System.out.println("Walking");
    }
}

interface CanRun {
    public default void walk() {
        System.out.println("Walking");
    }
    
    public abstract void run();
}

interface CanSprint extends CanWalk, CanRun { // won't compile - needs to implement it's own walk method
    void sprint();
}

