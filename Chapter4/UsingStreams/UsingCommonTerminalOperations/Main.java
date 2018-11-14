/* Common Terminal Operations 
* 
* Reductions are a special type of terminal operation where all of the contents of the stream are combined into a single primitive or Object.
* Terminal Stream operations
* Method                        What Happens for Infinite Streams         Return Value            Reduction
* allMatch()                    Sometimes terminates                      boolean                 No
/anyMath()
/noneMatch()
* collect()                     Does not terminate                        Varies                  Yes
* count()                       Does not terminate                        long                    Yes
* findAny()                     Terminates                                Optional<T>             No
/findFirst()       
* forEach()                     Does not terminate                        void                    No
* min()/max()                   Does not terminate                        Optional<T>             Yes
* reduce()                      Does not terminate                        Varies                  Yes
*/

import java.util.stream.Stream;
import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        // count() - determines the number of elements in a finite stream. 
        // method signature: long count()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
        
        // min() and max() - allows yo uto pass a custom comparator and find the smallest or largest value in a finite stream.
        // method signature: Optional<T> min(<? super T> comparator);
        // method signature: Optional<T> max(<? super T> comparator);
        
        Stream<String> s1 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min(string1, string2) -> string1.length() - string2.length());
        min.ifPresent(System.out::println); // ape
    
    }
    
}