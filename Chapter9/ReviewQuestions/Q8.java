/* Q8: What is the output of the following code? 

Path path1 = Paths.get("/pets/../cat.txt");
Path path2 = Paths.get("./dog.txt");
System.out.println(path1.resolve(path2));
System.out.println(path2.resolve(path1));

* A. /pets/../cat.txt/./dog.txt
     /pets/../cat.txt
*/