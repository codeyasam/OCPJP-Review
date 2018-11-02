
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

class Main {
    
    public static void main(String[] args) {
        Set<? extends RuntimeException> set = new HashSet<? extends RuntimeException>(); // incompatible type - compilation error
        Set<? extends RuntimeException> set1 = new HashSet<Exception>();                 // incompatible type - compilation error
        Set<? extends RuntimeException> set2 = new TreeSet<RuntimeException>();
        Set<? extends RuntimeException> set3 = new TreeSet<NullPointerException>();
    }
    
}