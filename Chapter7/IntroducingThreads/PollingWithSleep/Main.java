/* Polling wit Sleep 
*
*  Polling is the process of intermittently checking data at some fixed interval. 

e.g. You have a thread that modifies a shared static counter value and your main() thread is waiting for the thread to increase the value above 100. 

public class CheckResults {
    private static int counter = 0;
    public static void main(String[] args) {
        
        new Thread(() -> {
            for (int i = 0; i < 500; i++) 
                CheckResults.counter++;
        }).start();
        
        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet");
        }
        System.out.println("Reached!");
    }
}
*/

class CheckResults {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 100; i++)
                CheckResults.counter++;
        }).start();
        
        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");
    }
}