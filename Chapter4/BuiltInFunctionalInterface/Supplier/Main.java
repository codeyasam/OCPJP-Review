/* Implementing Supplier 
*
* A supplier is used when you want to generate or supply values taking any input.

* defined as:
* @FunctionalInterface public class Supplier<T> {
    public T get();
}
*/

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        
        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();
        
        System.out.println(d1);
        System.out.println(d2);
        
        System.out.println(s3.get());
        System.out.println(s4.get());
        
        Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);
        
        System.out.println(s5);
    }
}

