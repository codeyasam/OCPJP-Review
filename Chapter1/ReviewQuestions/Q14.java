/* Q14: Which is true statement about the following code? 
*/

import java.util.*;

class IsItFurry {
    
    static class Chipmunk {}
    
    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();   // Runnable is an interface
        int result = 0;
        if (c instanceof Chipmunk) result += 1; // is executed
        if (l instanceof Chipmunk) result += 2; // wont compile
        if (r instanceof Chipmunk) result += 4; // will compile but not executed
        System.out.println(result);
    }
    
}