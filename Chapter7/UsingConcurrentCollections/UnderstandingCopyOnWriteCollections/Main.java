/* Understandsing Copy on write collections */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for (Integer item: list) {
            System.out.println(item + " ");
            list.add(7);  // will throw a concurrentModificationError unless use CopyOnWrite
        }
        
        System.out.println();
        System.out.println("Size: " + list.size());
    }
    
}