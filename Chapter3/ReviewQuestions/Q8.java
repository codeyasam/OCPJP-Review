/* Q8: What is the result of the following code? */

import java.util.TreeSet;

public class Q8 {
    
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On")); // One 
    }
    
}