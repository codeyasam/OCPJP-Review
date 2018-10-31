import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.function.UnaryOperator;

class Main {
    
    public static void main(String[] args) {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u  = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println);
    }
    
}