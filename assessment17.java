import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;

class Main {
    
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("gorilla/signed-words.txt");
        
        Files.find(path.getParent(), 10, 
            (Path p, BasicFileAttributes b) -> p.toString().endsWith(".txt") && Files.isDirectory(p))
            .collect(Collectors.toList())
            .forEach(System.out::println);
    
        Files.readAllLines(path)
            .stream()
            .flatMap(p -> Stream.of(p.split(" ")))
            .map(s -> s.toLowerCase())
            .forEach(System.out::println);
    }
    
}