/* Creating Parallel Streams 
*
* 2 ways of creating parallel streams
*
* parallel() 
Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
Stream<Integer> parallelStream = stream.parallel();

* parallelStream()
Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
*/