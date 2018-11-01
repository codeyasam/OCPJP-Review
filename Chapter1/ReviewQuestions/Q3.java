/* Q3: What is the result of the following code?
*/

public class Q3 {
    
    public static void main(String[] args) {
        String s1 = "Canada";       // saved in string constant pool
        String s2 = new String(s1); // saved in heap
        if (s1 == s2) System.out.println("s1 == s2");   
        if (s1.equals(s2)) System.out.println("s1.equals(s2)");  // prints s1.equals(s2)
    } 
    
}