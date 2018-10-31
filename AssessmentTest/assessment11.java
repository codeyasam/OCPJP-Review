import java.util.stream.Stream;
import java.util.Optional;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
        //Stream<Integer> intStream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        //magic(Stream.empty()); // throws a "NoSuchElementException: No value present"
        //magic(Stream.iterate(1, x -> x++));
        //magic(Stream.of(5, 10)); // throws a "NoSuchElementException: No value present"
        
    }
    
    public static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
        System.out.println(o.get());
    }
    
}