/* Q18: Assuming the directories and files referenced here all exist and are accessible within the file system, what is the result of the following code? 

Path path1 = Paths.get("/lizard/./").resolve(Path.get("walking.txt"));
Path path2 = new File("/lizard/././actions/../walking.txt").toPath();

System.out.print(Files.isSameFile(path1, path2));
System.out.print(" " + path1.equals(path2));
System.out.print(" " + path1.normalize().equals(path2.normalize()));

* D. true false true
*/