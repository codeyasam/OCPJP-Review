/* Q13: Assume /monkeys exists as a regular directory containing multiple files, symbolic links, and subdirectories. What is true about the following code? (Choose all that apply.) 

Path path = Paths.get("/monkeys");
Files.find(path, 0, (p, a) -> a.isSymbolicLink())
    .map(p -> p.toString())  // y1
    .collect(Collectors.toList()) // y2
    .stream()  // y3
    .filter(x -> x.toString().endsWith(".txt"))  // y4
    .forEach(System.out::println);
    
* B. It will print nothing.
* 
*/