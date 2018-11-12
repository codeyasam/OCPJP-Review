/* Q5: Which of these statements compile? 
*/

import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q5 {
    
    public static void main(String[] args) {
        HashSet<Number> hs = new HashSet<Integer>();                        // won't compile
        HashSet<? super ClassCastException> set = new HashSet<Exception>(); // will compile
        List<String> list = new Vector<String>();                           // will compile
        List<Object> values = new HashSet<Object>();                        // won't compile
        List<Object> objects = new ArrayList<? extends Object>();           // won't compile
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();  // will compile
    }
    
}