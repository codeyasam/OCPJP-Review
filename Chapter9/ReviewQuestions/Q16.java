/* Q16: Assuming /squid/food-schedule.csv exists as a regular non-empty file that a program has access to read, what is correct about the following code snippet? (Choose all that apply.) 

Path path = Paths.get("/squid/food-schedule.csv");
Files.lines(path)  // r1
    .flatMap(p -> Stream.of(p.split(","))) // r2
    .map(s -> s.toUpperCase())  // r3
    .forEach(System.out::println);
    
* F. If it prints anything, it will not include commas.
*/