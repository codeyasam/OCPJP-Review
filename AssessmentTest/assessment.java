import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

class BabyPandaBathManager {
    
    public static void await(CyclicBarrier cb) {    
        try {
           cb.await();   
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handled Exception
        }
    }
    
    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean")); //u1
        
        ExecutorService service = Executors.newScheduledThreadPool(3);
        IntStream.iterate(1, i -> 1) // u2
            .limit(12)
            .forEach(i -> service.submit(  // u3
                () -> await(cb))); // u4
        service.shutdown();
    }
}