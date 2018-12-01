/* Q3: What is the result of executing the following code? (Choose all that apply.) 

1: Path path = Paths.get("sloth.schedule");
2: BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
3: if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
4:     attributes.setTimes(null, null, null);
5: }

* D. The code will not compile because of line 4.  
*/