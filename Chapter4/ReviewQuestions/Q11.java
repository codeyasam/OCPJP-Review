/* Q11: What changes need to be made for this code to print the string 12345? (choose all that apply) 
* 
* Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining());

*/

import java.util.stream.Stream;
import java.util.stream.Collectors; 

public class Q11 {
    
    public static void main(String[] args) {
        String result = Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining());
        System.out.println(result);
    }
    
}