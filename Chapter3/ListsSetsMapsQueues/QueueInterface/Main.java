/* Queue Interface
*
* you use a queue when elements are added and removed in a specific order. Queues are typically used for sorting elements prior to processing them.
* Unless stated otherwise, a queue is assumed to be FIFO (First In, First Out)

* Array Deque    
* method signature        Description                                For queue      For Stack

* boolean add(E e)        Adds an element to the back of the queue   Yes            No  
                          and returns true or throws an exception
* E element()             Returns next element or throws an          Yes            No
                          exception if empty queue            
* boolean offer(E e)      Adds an element to the back of the queue   Yes            No
                          and returns wether successful
* E remove()              Removes and returns next element or        Yes            No 
                          throws an exception if empty queue
* void push(E e)          Adds an element to the front of the queue  Yes            Yes
* E poll()                Removes and returns next element or        Yes            No 
                          returns null if empty queue 
* E peek()                Returns next element or returns null if    Yes            Yes
                          empty queue
* E pop()                 Removes and returns next element or        No             Yes
                          throws an exception if empty queue
*/

import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    
    public static void main(String[] args) {
        // offer poll peek - FIFO (single-ended queue)
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));    // true
        System.out.println(queue.offer(4));     // true
        System.out.println(queue.peek());       // 10
        System.out.println(queue.poll());       // 10
        System.out.println(queue.poll());       // 4
        System.out.println(queue.peek());       // null
        
        // push poll peek - LIFO (stack)
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek()); // 4
        System.out.println(stack.poll()); // 4
        System.out.println(stack.poll()); // 10
        System.out.println(stack.peek()); // null
    }
    
}

/* a LinkedList works the exact same way as ArrayDeque
*/