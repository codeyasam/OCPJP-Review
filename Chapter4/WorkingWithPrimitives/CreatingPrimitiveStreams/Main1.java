/* Mapping from another stream type 
*
* // Mapping methods between types of streams
* Source Stream Class          To Create Stream        To Create DoubleStream           To Create IntStream             ToCreateLongStream
* Stream                       map                     mapToDouble                      mapToInt                        mapToLong
* DoubleStream                 mapToObj                map                              mapToInt                        mapToLong
* IntStream                    mapToObj                mapToDouble                      map                             mapToLong
* LongStream                   mapToObj                mapToDouble                      mapToInt                        map
*
* // Function parameters when mappingbetween types of streams
* Source Stream Class            To Create Stream           To Create DoubleStream          To Create IntStream         To Create LongStream
* Stream                         Function                   ToDoubleFunction                ToIntFunction               ToLongFunction
* DoubleStream                   DoubleFunction             DoubleUnaryOperator             DoubleToIntFunction         DoubleToLongFunction
* IntStream                      IntFunction                IntToDoubleFunction             IntUnaryOperator            IntToLongFunction
* LongStream                     LongFunction               LongToDoubleFunction            LongToIntFunction           LongUnaryOperator
*/

import java.util.stream.Stream;

public class Main1 {
    
    public static void main(String[] args) {
        
    }
    
}