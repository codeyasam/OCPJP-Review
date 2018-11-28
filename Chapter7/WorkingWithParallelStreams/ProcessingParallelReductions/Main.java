/* Processing Parallel Reductions 
*
* Performing Order Based Tasks

Requirements for reduce() Arguments
* Identity 
* Accumulator 
* Combiner 

If you follow these principles when building your reduce() arguments, then the operation can be performed using parallel stream and result will be ordered as they would be in a serial stream.

* Non-associative accumulator.
System.out.println(Arrays.asList(1,2,3,4,5,6)
    .parallelStream()
    .reduce(0, (a,b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR

Other problems using identity parameter
System.out.println(Arrays.asList("w", "o", "l", "f")
    .parallelStream()
    .reduce("X", String::concat));

// this can output: XwXoXlXf

// Combining results with collect()
Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
System.out.println(set); // [f, l, o, w]


* Rewrite example from chapter 4 to use a parallel stream and parallel reduction
Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + " " s2));
System.out.println(map);
System.out.println(map.getClass());  // java.util.concurrent.ConcurrentHashMap

* Rewrite groupingBy() example from Chapter 4 to use parallel stream and parallel reduction
Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel(); 
Concurrent<Integer, List<String>> map = ohMy.collect(Collectors.groupingByConcurrent(String::length));
System.out.println(map);  // {5=[lions, bears], 6=[tigers]}
*/
