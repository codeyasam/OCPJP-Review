import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

class AssessmentSeven {
    
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/baths/night", "../").resolve(Paths.get("./sleep.txt")).normalize();
        System.out.println(path1.toString());
        Path path2 = new File("/baths/sleep.txt").toPath().toRealPath();
        System.out.println(path2.toString());
        
        System.out.print(Files.isSameFile(path1, path2));
        System.out.print(" " + path1.equals(path2));
    }
    
}