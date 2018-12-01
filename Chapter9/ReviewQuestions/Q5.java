/* Q5: Assume /kang exists as a symbolic link to the directory /mammal/kangaroo wihtin the system. Which of the following statements are correct about this code snippet? (Choose all that apply.) 

Path path = Paths.get("/kang");
if (Files.isDirectory(path) && Files.isSymbolicLink(path)) {
    Files.createDirectory(path.resolve("joey"));
}

* B. A new directory will be created only if /mammal/kangaroo exists.
* C. If the code creates a directory, it will be reached at /kang/joey.
* D. If the code creates a directory, it will be reached at /mammal/kangaroo/joey
*/