/* Printing Streams 
*
* Option                                               Works for infinite Streams                         Destructive to Stream
* s.forEach(System.out::println)                       No                                                 Yes
* System.out.println(s.collect(Collectors.toList()))   No                                                 Yes
* s.peek(System.out::println).count()                  No                                                 No
* s.limit(5).forEach(System.out::println)              Yes                                                Yes
*/

public class Main {
    
    public static void main(String[] args) {
        
    }
    
}