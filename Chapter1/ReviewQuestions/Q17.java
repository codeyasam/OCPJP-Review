/* Q17: What is the result of the following code?
*/

enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false) // won't compile without semi colon
    boolean hasHair;
    
    public AnimalClasses(boolean hasHair) { // won't compile - enum could only have private constructor
        this.hasHair = hasHair;
    }
    
    public boolean hasHair() {
        return hasHair;
    }
    
    public void giveWig() {
        hasHair = true;
    }
}