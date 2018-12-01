/* Using Path Objects 
*
* Path interface contains three methods to retrieve basic information about the path representative.
* toString()
* getNameCount()
* getName()

*/

import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The path name is: " + path);
        
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("  Element " + i + " is: " + path.getName(i));   
        }
        
       Path path2 = Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath();
        System.out.println(path2);
    }
    
}

/* Accessing Path Components with getFileName(), getParent(), and getRoot() 
*
* 
*/

class PathFilePathTest {
    
    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        
        Path currentPath = path;
        while ((currentPath = currentPath.getParent()) != null) {
            System.out.println(" Current parent is: " + currentPath);
        }
    }
    
    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));
    }
    
}

/* Checking Path Type with isAbsolute() and toAbsolutePath()
*
*/

class PathType {
    
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute?" + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());
        
        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute());
        System.out.println("Absolute Path2 " + path2.toAbsolutePath());
    }
    
}

/* Creating new path with subpath() 
*
*/

class PathSubPath {
    
    public static void main(String[] args) {
        Path path = Paths.get("/mammal/carnivore/racoon.image");
        System.out.println("Path is: " + path);
        
        System.out.println("Subpath from 0 to 3 is: " + path.subpath(0,3));
        System.out.println("Subpath from 1 to 3 is: " + path.subpath(1,3));
        System.out.println("Subpath from 1 to 2 is: " + path.subpath(1,2));
            
        // 0 to 4 or 1 to 1 will throw an exception at runtime
    }
    
}

/* Deriving a Path with relativize()
*
* relativize() method requires that both paths be absolute or both relative else it will throw an IllegalArgumentException
*/

class PathRelativize {
    
    public static void main(String[] args) {
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
        
        Path path3 = Paths.get("/habitat");
        Path path4 = Paths.get("/sanctuary/raven");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));        
    }
    
}

/* Joining Path Objects with Resolve */

class PathResolve {
    
    public static void main(String[] args) {
        final Path path1 = Paths.get("/cats/../panther");
        final Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));
    }
    
}

/* Cleaning up a path with normalize() */

class PathNormalize {
    
    public static void main(String[] args) {
        Path path1 = Paths.get("/sample/");
        Path path2 = Paths.get("/another/two");
        System.out.println(path1.resolve(path2).normalize());
    }
}

/* Checking for File Existence with toRealPath
* 
* throws IOException and supports symbolic link
*/