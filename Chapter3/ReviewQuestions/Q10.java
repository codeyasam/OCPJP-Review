/* Q10: What is the result of the following program? */

import java.util.Comparator;
import java.util.Arrays;

public class Q10 {
    
    public static void main(String[] args) {
        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (String s: values) 
            System.out.print(s + " ");
    }
    
}

class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());  // it is being compared in descending order
    }
}