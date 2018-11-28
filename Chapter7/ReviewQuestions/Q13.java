/* Q13: What statements about the following code snippet are true? (Choose all that apply.) 
*
* 
Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();
ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears)
    .flatMap(s -> s)
    .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
System.out.println(data.get(false).size() + " " + data.get(true).size());
*
* A. It outputs 3 4
* G. The collect() operation is always executed in a single-threaded fashion    (because the stream is not declared as parallel)
*/