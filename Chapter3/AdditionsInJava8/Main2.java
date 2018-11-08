/* Method References: 4 formats
*
* Static Methods
* Instance methods on a particular instance
* Instance methods on an instance to be determined at runtime
* Constructors
*/

import java.util.function.Consumer
import java.util.Collections;


public class Main2 {
    
    public static void main(String[] args) {
        // static method
        Consumer<List<Integer>> methodRef1 = Collections::sort;
    }
    
}