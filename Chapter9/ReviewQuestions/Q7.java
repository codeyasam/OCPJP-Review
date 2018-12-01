/* Q7: If the current working directory is /zoo and the path /zoo/turkey does not exist, then what is the result of executing the following code? (Choose all that apply.) 

Path path = Path.get("turkey");
if (Files.isSameFile(path, Paths.get("/zoo/turkey"))) // x1
    Files.createDirectory(path.resolve("info"));      // x2
    
* F. It compiles but throws an exception at runtime.
*/