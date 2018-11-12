/* Using Variables in Lambdas 
*
* Lambda expressions can access static variables, instance variables, effectively final method parameters, and effectivey final local variables.
*/


interface Gorilla { 
    String move();
}

class GorillaFamily {
    String walk = "walk";
    void everyonePlay(boolean baby) {
        String approach = "amble";
        // approach = "run" - if uncommented, will result in compiler error because not local variable is not effectively final
        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }
    
    void play(Gorilla g) {
        System.out.println(g);
    }
}