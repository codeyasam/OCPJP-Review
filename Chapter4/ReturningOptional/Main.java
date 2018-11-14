/* Returning Optional 
*
* Method                      When Optional Is Empty                          When Optional Contains a Value
* get()                       Throws an exception                             Returns value
* ifPresent(Consumer c)       Does nothing                                    Calls Consumer c with value
* isPresent()                 Returns false                                   Returns true
* orElse(T other)             Returns other parameter                         Returns value
* orElseGet(Supplier s)       Returns result of calling Supplier              Returns value
* orElseThrow(Supplier s)     Throws exception created by calling Supplier    Returns value
*/

import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());
        
        Optional<Double> opt = average(90, 100);
        if(opt.isPresent()) {
            System.out.println(opt.get());
        }
        
        Optional opt3 = Optional.ofNullable(average(90, 100));
        System.out.println(opt3.get());
        
        Optional<Double> opt4 = average();
        opt4.ifPresent(System.out::println);
        System.out.println(opt4.orElse(Double.NaN));
        System.out.println(opt4.orElseGet(() -> Math.random()));
        System.out.println(opt4.orElseThrow(() -> new IllegalStateException()));
        
        
        Optional<Double> opt2 = average();
        System.out.println(opt2.get());       // NoSuchElementException: No value present
    }
    
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
    
}