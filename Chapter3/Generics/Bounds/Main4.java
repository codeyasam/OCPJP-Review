/* Upperbounded Wildcards
*/

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
        
    }
}

class Goose implements Flyer {
    public void fly() {
        
    }
}

/* a variable of type List<Flyer> can be passed to either method.
A variable of type List<Goose> can be passed only to the one with the upper bound */

class Main {
    
    private void anyFlyer(List<Flyer> flyer) {
        
    }
    
    private void groupOfFlyers(List<? extends Flyer> flyer) {
        
    }
}