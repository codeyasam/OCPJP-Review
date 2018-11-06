/* Lower-bounded types
* 
*/

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main6 {
    
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<Object>();
        list.add(new Object()); // WON'T COMPILE
        
        List<? super IOException> exceptions = new ArrayList<Exception>();
        exceptions.add(new Exception()); // WON'T COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }
    
}