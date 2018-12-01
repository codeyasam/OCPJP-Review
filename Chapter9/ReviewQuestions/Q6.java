/* Q6: Given that /animals is a directory that exists and it is empty, what is the result of the following code?

Path path = Paths.get("/animals");
boolean myBoolean = Files.walk(path)
    .filter((p, a) -> a.isDirectory() && !path.equals(p)) // w1
    .findFirst().isPresent();  // w2
System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");

* C. The code will not compile because of line w1.
*/