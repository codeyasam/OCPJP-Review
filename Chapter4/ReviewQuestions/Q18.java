/* Q18: what is the result of the following */

import java.util.stream.DoubleStream;

public class Q18 {
    
    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x > 2).count(); // 1.2 and 2.4
    }
    
}