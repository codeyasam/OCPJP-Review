/* Q11: For the copy() method shown here, assume that the source exists as regular file and that the target does not. What is the result of the following code?

Path path1 = Paths.get("./goat.txt).normalize(); // k1
Path path2 = Paths.get("mule.png");
Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES); // k2
System.out.println(Files.isSameFile(path1, path2)); // k3

* A. It will output false.
*/