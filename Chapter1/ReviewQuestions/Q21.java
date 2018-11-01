/* Q21: Which of the following could be inserted to fill in the blank
*/

interface Otter {
    default void play() {}
}

class RiverOtter implements Otter {
    
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    @Override
    public int hashCode() {  
        return 42;
    }
    
    @Override
    public void play() {
        
    }
    
}