/* Processing Task in Parallel 
*
* Arrays.asList(1,2,3,4,5,6)
    .parallelStream()
    .forEach(s -> System.out.println(s + " "));
    
// not in order

Understanding Performance Improvements
*/

import java.util.*;

class WhaleDataCalculator {
    
    public int processRecord(int input) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            
        }
        return input+1;
    }
    
    public void processAllData(List<Integer> data) {               // 4.something seconds using serialStreams
        data.parallelStream().map(a -> processRecord(a)).count();  // 1.something seconds using parallelStreams
    }
    
    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        
        // Define the data
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) data.add(i);
        
        // Process the data
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start) / 1000.0;
        
        // Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }
    
}