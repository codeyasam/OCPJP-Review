/* Q9: Which of the answer choices are valid given the following declaration? */

import java.util.Map;
import java.util.HashMap;

/*NONE OF THIS WILL COMPILE: Map DOES NOT HAVE an ADD method. PUT*/

public class Q9 {
    
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.add("pi", 3.14159);              
        map.add("log(1)", new Double(0.0));
    }
    
}