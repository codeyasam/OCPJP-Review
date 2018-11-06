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

class Main {
    
    private void anyFlyer(List<Flyer> flyer) {
        
    }
    
    private void groupOfFlyers(List<? extends Flyer> flyer) {
        
    }
}