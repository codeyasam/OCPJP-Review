/* Q17: Assuming the current directory is /animals/cute, which are possible results of executing the following code? (Choose all that apply.) 

Files.walk(Paths.get("..").toRealPath().getParent()) // u1
    .map(p -> p.toAbsolutePath().toString())         // u2
    .filters(s -> s.endsWith(".java"))               // u3
    .collect(Collectors.toList())                    
    .forEach(System.out::println);                   
    
* A. It compiles but may throw an exception at runtime.
* G. It prints all .java files in the root directory tree.
*/