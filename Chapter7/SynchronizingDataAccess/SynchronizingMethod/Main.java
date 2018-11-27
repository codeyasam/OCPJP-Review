/* Synchronizing Methods 
*
* 
*/

import java.util.concurrent.*;

class SheepManager {
    
    private int sheepCount = 0;

    // using synchronized in methods
    private synchronized void incrementAndReport() {
        System.out.println((++sheepCount) + " ");
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
    
}