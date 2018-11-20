/* Chaining Optionals */

import java.io.IOException;
import java.util.Optional;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    
    public static void main(String[] args) {
        
        
    }
    
    private static void anotherThreeDigit(Optional<String> optional) {
        Optional<Integer> result = optional.map(String::length);
        Optional<Integer> result2 = optional.flatMap(Main::calculator);
    }
    
    private static Optional<Integer> calculator(String s) {
        return Optional.of(s.length());
    }
    
    // suppose that you are given an Optional<Integer> and asked to print the value, only if it is three digit number
    // without functional programming
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) {
                System.out.println(string);
            }
        }
    }
    
    // with functional programming
    private static void threeDigitFP(Optional<Integer> optional) {
        optional.map(n -> "" + n)             // part 1
            .filter(s -> s.length() == 3)     // part 2
            .ifPresent(System.out::println);  // part 3
    }
}

class ExceptionCaseStudy {
    
    public static void main(String[] args) {
        System.out.println("Executed");
        //ExceptionCaseStudy.create().stream().count(); // unreported exception IOException
        Supplier<List<String>> s = ExceptionCaseStudy::createSafe;  
        //Supplier<List<String>> s = ExceptionCaseStudy::create; // incompatible thrown types IOException
    }
    
    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private static List<String> create() throws IOException {
        throw new IOException();
    }
    
}