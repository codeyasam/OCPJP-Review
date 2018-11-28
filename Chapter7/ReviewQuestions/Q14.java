/* Q14: What is the result of calling the following method? 

public void addAndPrintItems(BlockingQueue<Integer> deque) {
    deque.offer(103);
    deque.offerFirst(20, 1, TimeUnit.SECONDS);
    deque.offerLast(85, 7, TimeUnit.HOURS);
    System.out.println(deque.pollFirst(200, TimeUnit.NANOSECONDS));
    System.out.println(" " + deque.pollLast(1, TimeUnit.MINUTES));
}

* D. The code will not compile   (lines 5,6,7,8 throws InterruptedException which is a checked Exception)
*/