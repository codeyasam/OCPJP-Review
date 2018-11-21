/* Q15: Given the following code, which of the answer choices can fill in the blank to print true? (Choose all that apply) 
*
* String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
* String m2 = Duration.ofMinutes(1).toString();
* String s  = Duration.of(60, ChronoUnit.SECONDS).toString();
*
* String d = Duration.ofDays(1).toString();
* String p = Period.ofDays(1).toString();
*
* System.out.println(______);

* B. m1.equals(m2);
* C. m1.equals(s);
*/

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Q15 {
    
    public static void main(String[] args) {
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String s = Duration.of(60, ChronoUnit.SECONDS).toString(); // if 59 - 59S but since it is 60 - 1M
        System.out.println(s);
    }
    
}

