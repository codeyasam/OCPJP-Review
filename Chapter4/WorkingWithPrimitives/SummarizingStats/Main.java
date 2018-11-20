/* Summarizing Statistics */


import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class Main {
    
    public static void main(String[] args) {
        
    }
    
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
    
}