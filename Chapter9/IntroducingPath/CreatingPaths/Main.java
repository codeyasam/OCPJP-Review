/* Creating Paths 
*
* java.nio.file.Paths

Path path1 = Paths.get("pandas/cuddly.png");
Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
Path path3 = Paths.get("/home/zoodirector");

path1 = Paths.get("pandas", "cuddly.png");
path2 = Paths.get("c:", "zooinfo", "November", "employees.txt");
path3 = Paths.get("/", "home", "zoodirector");

Another way to create a Path using the Paths class is with a URI value. A uniform resource identifier (URI) is a string of characters that identify a resource. It begins with a schema that indicates the resource type, followed by a path value. 

* Another way to construct a Path using the Paths class is with a URI value.

Path path1 = Paths.get(new URI("file://pandas/cuddly.png")); // THROWS EXCEPTION AT RUNTIME (URIs must reference absolute paths at runtime.)

Path path2 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
Path path3 = Paths.get(new URI("file:///home/zoodirectory"));

* Path to URI
Path path4 = Paths.get(new URI("http://www.wiley.com"));
URI uri4 = path4.toUri();

* Accessing the Underlying FileSystem Object
* Paths.getPath() method is a shorthand for java.nio.file.FileSystem

Path path1 = FileSystem.getDefault().getPath("pandas/cuddly.png");
Path path2 = FileSystem.getDefault().getPath("c:", "zooinfo", "November", "employees.txt");
Path path3 = FileSystem.getDefault().getPath("/home/zoodirector");

* While most of the time we want to access a Path object that is within the local file system, the FileSystems factory class does give us the ability to connect to a REMOTE FILE SYSTEM

* java.nio.file.FileSystems
* FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));

Path path = fileSystem.getPath("duck.txt");

// this code is useful when we need to construct Path objects frequently for a remote file system.

* Working with Legacy File instances 

File file = new File("pandas/cuddly.png");
Path path = file.toPath();

// for backward compatibility 

Path path = Paths.get("cuddly.png");
File file = path.toFile();
*/