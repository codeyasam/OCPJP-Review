/* Learning the Functional Interfaces for Primitives 
*
* Common functional interfaces for primitives
* Functional Interfaces           # Parameters        Return Type                    Single Astract Method
* DoubleSupplier                  0                   double                         getAsDouble
* IntSupplier                                         int                            getAsInt
* LongSupplier                                        long                           getAsLong
* DoubleConsumer                  1 (double)          void                           accept
* IntConsumer                     1 (int)                                            
* LongConsumer                    1 (long)
* DoublePredicate                 1 (double)          boolean                        test
* IntPredicate                    1 (int)               
* LongPredicate                   1 (long)
* DoubleFunction<R>               1 (double)          R                              apply
* IntFunction<R>                  1 (int)             
* LongFunction<R>                 1 (long)
* DoubleUnaryOperator             1 (double)          double                         applyAsDouble
* IntUnaryOperator                1 (int)             int                            applyAsInt
* LongUnaryOperator               1 (long)            long                           applyAsLong
* DoubleBinaryOperator            2 (double, double)  double                         applyAsDouble
* IntBinaryOperator               2 (int, int)        int                            applyAsInt
* LongBinaryOperator              2 (long, long)      long                           applyAsLong

* Primitive-specific functional interfaces
* Functional Interfaces               # Parameters          Return Type              Single Abstract Method
* ToDoubleFunction<T>                 1 (T)                 double                   applyAsDouble
* ToIntFunction<T>                                          int                      applyAsInt
* ToLongFunction<T>                                         long                     applyAsLong

* ToDoubleBiFunction<T, U>            2 (T, U)              double                   applyAsDouble
* ToIntBiFunction<T, U>                                     int                      applyAsInt
* ToLongBiFunction<T, U>                                    long                     applyAsLong

* DoubleToIntFunction                 1 (double)            int                      applyAsInt
* DoubleToLongFunction                1 (double)            long                     applyAsLong
* IntToDoubleFunction                 1 (int)               double                   applyAsDouble
* IntToLongFunction                   1 (int)               long                     applyAsLong
* LongToDoubleFunction                1 (long)              double                   applyAsDouble
* LongToIntFunction                   1 (long)              int                      applyAsInt

* ObjDoubleConsumer<T>                2 (T, double)         void                     accept
* ObjIntConsumer<T>                   2 (T, int)
* ObjLongConsumer<T>                  2 (T, long) 
*/

import java.util.stream.Stream;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleToIntFunction;

public class Main {
    
    public static void main(String[] args){
        // Functional Interfaces for boolean
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());
        
        double d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        int result = f1.applyAsInt(d);
        System.out.println(result);
    }
    
}