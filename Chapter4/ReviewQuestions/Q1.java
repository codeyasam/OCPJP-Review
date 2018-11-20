/* Q1: What is the output of the following 
*
* D. java.util.stream.ReferencePipeline$3@4517d9a3
*/

import java.util.stream.Stream;

public class Q1 {
    
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
    
}