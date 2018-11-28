/*  Understanding Independent Operations 
*
* consider the following example:
Arrays.asList("jackal", "kangaroo", "lemur")
    .parallelStream()
    .map(s -> s.toUpperCase())
    .forEach(System.out::println);
    
// in this exoample, mapping jackal to JACKAL can be done independently of mapping kangaroo to KANGAROO.

map(), forEach(), filter() can be processed independently, although order is not guaranteed.

Arrays.asList("jackal", "kangaroo", "lemur")
    .parallelStream()
    .map(s -> { System.out.println(s); return s.toUpperCase(); })
    .forEach(System.out::println);

* posssible output:
    kangaroo
    KANGAROO
    lemur
    jackal
    JACKAL
    LEMUR   
    
note: anytime you are working with a collection with a parallel stream, it is recommended that you use a concurrent collection. 
*/