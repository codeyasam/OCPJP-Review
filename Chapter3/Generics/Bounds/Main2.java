/* Generics: Unbounded
*/

import java.util.List;
import java.util.ArrayList;

public class Main2 {
    
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }
    
    public static void printList(List<?> list) {
        for (Object x: list) {
            System.out.println(x);
        }
    }
}