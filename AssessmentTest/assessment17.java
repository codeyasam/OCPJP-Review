import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.io.IOException;

class Main {
    
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("gorilla/signed-words.txt");
        
        Files.find(path.getParent(), 1,
            (Path p, BasicFileAttributes b) -> p.toString().endsWith(".txt") && Files.isDirectory(p))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        
    }
    
}