/* Collecting Results 
*
* Examples of grouping/partitioning collectors
* Collector                                      Description                     Return Value When Passed to collect
* averagingDouble(ToDoubleFunction f)            calculates the average for      Double
* averagingInt(toIntFunction f)                  three core primitive types
* averagingLong(toLongFunction f)                

* counting()                                     Counts the numbers of elements  Long
* groupingBy(Function f)                         Creates a map grouping by the   Map<K, List<T>> 
* groupingBy(Function f, Collector dc)           specified function with the 
* groupingBy(Function f, Supplier s,             optional type and optional     
Collector dc)                                    downstream collector

* joining()                                      Creates a single String using   String
* joining(CharSequence cs)                       cs as a delimiter between 
                                                 elements if one is specified
                                                 
* maxBy(Comparator c)                            Finds the largest/smallest      Optional<T>
* minBy(Comparator c)                            elements

* mapping(Function f, Collector dc)              Adds another level of           Collector 
                                                 collectors
* partitionBy(Predicate p)                       Creates a map grouping by       Map<Boolean, List<T>>
* partitionBy(Predicate p, Collector dc)         the specified predicate with 
                                                 the optional further down
                                                 stream collector
* summarizingDouble(ToDoubleFunction f)          Calculates average, min, max    DoubleSummaryStatistics
* summarizingInt(ToIntFunction f)                and so on                       IntSummaryStatitics
* summarizingLong(toLongFunction f)                                              LongSummaryStatistics

* summingDouble(ToDoubleFunction f)              Calculates the sum for our      Double
* summingInt(ToIntFunction f)                    three core primitive types      Integer
* summingLong(ToIntFunction f)                                                   Long

* toList()                                       Creates an arbitrary type of    List
* toSet()                                        list or set                     Set

* toCollection(Supplier s)                       Creates a Collection of the     Collection
                                                 specified type 
* toMap(Function k, Function v)                  Creates a map using functions   Map
* toMap(Function k, Function v,                  to map the keys, values, an 
BinaryOperator m)                                optional merge function, and 
* toMap(Function k, Function v,                  an optional type
BinaryOperator m, Supplier s)
*/