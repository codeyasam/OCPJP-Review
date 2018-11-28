/* Working with Concurrent Classes 
*
* You should use a concurrent collection class anytime that you are going to have multiple threads modify a collections object outside a synchronized block
* or method, even if you don't expect a concurrency problem. 

* Concurrent Collection Classes 
* Class Name                 Java Collection Framework             Elements Ordered                    Sorted                      Blocking
* ConcurrentHashMap          ConcurrentMap                         No                                  No                          No
* ConcurrentLinkedDeque      Deque                                 Yes                                 No                          No
* ConcurrentLinkedQueue      Queue                                 Yes                                 No                          No
* ConcurrentSkipListMap      ConcurrentMap                         Yes                                 Yes                         No
                             SortedMap
                             NavigableMap 
* ConcurrentSkipListSet      SortedSet                             Yes                                 Yes                         No
                             NavigableSet 
* CopyOnWriteArrayList       List                                  Yes                                 No                          No
* CopyOnWriteArraySet        Set                                   No                                  No                          No
* LinkedBlockingDeque        BlockingQueue                         Yes                                 No                          Yes
                             BlockingDeque
* LinkedBlockingQueue        BlockingQueue                         Yes                                 No                          Yes

* BlockingQueue waiting methods
* Method Name                     Description
* offer(E e), long timeout,       Adds item to the queue waiting the specified time, returning false if time elapses before space is available 
TimeUnit unit)
* poll(long timeout, TimeUnit     Retrieves and removes an item from the queue, waiting the specified time, returning null if the time elapses before the item 
unit)                             is available
* 
*/

import java.util.*;
import java.util.concurrent.*;
 
public class Main {
    
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));
    
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(4);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println("******************");
        
        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));            
        } catch (Exception e) {
            
        }
        

    }
    
    
    
}