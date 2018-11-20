/* Linking Streams to the Underlying Data 
* 
* What do you think this outputs?
*/

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        
        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count()); // 3
    }
    
}
