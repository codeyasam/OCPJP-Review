/* Working with Periods
*
* Period format: System.out.println(Period.of(1, 2, 3));
* P1Y2M3D
* System.out.println(Period.ofMonths(3));
* P3M
* System.out.println(Period.of(0, 20, 47));
* P20M47D
* System.out.println(Period.ofWeeks(3));
* P21D

* only applicable to date LocalDate and LocalDateTime
* date.plus(period)
* dateTime.plus(period)
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Main {
    
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);   // but this is not reusable if zookeepers wants to change the period every now and then
        Period period = Period.ofMonths(1);
        performReusableAnimalEnrichment(start, end, period);
        
        // Five ways to create a Period class
        Period anually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);  // 1 year 0 months, and 7 days
        
        // there's a catch, you cannot chain methods when creating a period.
        Period wrong = Period.ofYears(1).ofWeeks(1);
        
        Period wrong1 = Period.ofYears(1);
        wrong1 = Period.ofWeeks(1);
    }
    
    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {    // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);  // add a month
        }
    }
    
    private static void performReusableAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
    
}