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
*/

class PathRelativize {

}