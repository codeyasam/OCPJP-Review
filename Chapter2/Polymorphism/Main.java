/* Polymorphism 
*
* is the ability of a single interface to support multiple underlying forms.
*/

interface LivesInOcean {
    public void makeSound();
}

class Dolphin implements LivesInOcean {
    
    @Override
    public void makeSound() {
        System.out.println("Whistle");
    }
    
}

class Whale implements LivesInOcean {
    
    @Override
    public void makeSound() {
        System.out.println("Sing");
    }
    
}

class Oceanographer {
    
    public void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }
    
    public static void main(String[] args) {
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }
}