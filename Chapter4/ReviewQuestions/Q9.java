/* Which of the following can we add after line 5 for the code to run without error and not produce any output? (Choose all that apply) 
*
* 
* LongStream ls = LongStream.of(1, 2, 3);
* OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();

* B, D
* if (opt.isPresent()) System.out.println(opt.getAsLong);  // since it's a LongStream
* opt.ifPresent(System.out::println)                       // method reference   (both no output since all numbers are greater due to map)
*/