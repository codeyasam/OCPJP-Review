/* Q20: What is the simplest way of rewriting this code? 
*
* List<Integer> l = IntStream.range(1, 6)
.mapToObj(i -> i).collect(Collectors.toList());
l.forEach(System.out::println);

* B. IntStream.range(1, 6).forEach(System.out::println); // both list and stream have forEach method
*/