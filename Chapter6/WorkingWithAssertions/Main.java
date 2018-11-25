/* Working with Assertions 
*
* An assertion is a Boolean expression that you place at a point in your code where you expect something to be true. 
*/

public class Main {
    
    public static void main(String[] args) {
        // The assert statement
        // two forms: assert boolean_expression; 
        //            assert boolean_expressoin : error_message;
        // The optional error message is a string used as the message for the AssertionError that is thrown.
        
        // Three possible outcomes of assertions 
        // * If assertions are disabled, java skips the assertion and goes on in the code.
        // * If assertions are enabled and the boolean expression is true then our assertion has been validated and nothing happens. The program continues to execute in its normal manner.
        // * If assertions are enebled and the boolean expression is false, then our assertion is invalid and a java.lang.AssertionException is thrown
        
        // suppose that we enable assertions by running the command java -ea or -enableassertions
        int numGuests = -5;
        assert numGuests > 0;
        System.out.println(numGuests);
    }
    
}