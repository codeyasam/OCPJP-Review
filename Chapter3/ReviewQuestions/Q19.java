/* Q19: Which options are true of the following code? */

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Q19 {
    
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);           // remove by index
        System.out.println(q); // [10]
        
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        q2.add(12);
        q2.remove(1); // tries to look for value of 1 in the queue to remove
        System.out.println(q2); // [10, 12];
    }
    
}