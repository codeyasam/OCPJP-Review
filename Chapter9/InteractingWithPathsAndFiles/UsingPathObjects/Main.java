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