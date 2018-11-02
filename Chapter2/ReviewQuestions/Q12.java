/* Q12: What is the result of the following code?
*/

interface Climb {
    boolean isTooHigh(int height, int limit);
}

class Climber {
    
    public static void main(String[] args) {
        check((h, l) -> h.toString(), 5); // x1 - won't compile the isTooHigh method is expecting a boolean not a String
    }
    
    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))    // x2
            System.out.println("too high");
        else 
            System.out.println("ok");
    }
    
}