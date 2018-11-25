/* Q13: Which of the following can legally fill in the blank? (Choose all that apply.) */

// A. leave line blank

class AhChoo {
    static class SneezeException extends Exception {
        
    }
    static class SniffleException extends SneezeException {
        
    }
    
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | RuntimeException e) {
            __________
            throw e;
        }
    }
}