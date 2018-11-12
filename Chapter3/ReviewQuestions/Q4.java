/* Q4: What is the result of the following statements? */

import java.util.ArrayDeque;

public class Q4 {
    
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello"); // top of the stack
        greetings.push("hi");    // this is now the top of the stack
        greetings.push("ola");   // this is now the top of the stack
        greetings.pop();         // ola is now popped from the stack
        greetings.peek();        
        
        while (greetings.peek() != null) {     //prints hihello
            System.out.print(greetings.pop()); 
        }
    }
    
}