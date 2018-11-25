/* Q12: Which of the following can legally fill in the blank? (Choose all that apply.) */

// A. leave line blank
// D. e = new SneezeException();
// E. e = new SniffleException();
// 

class AhChoo {
    
    static class SneezeException extends Exception {
        
    }
    
    static class SniffleException extends SneezeException {}
    
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
            ________
            throw e;
        }
    }
    
}