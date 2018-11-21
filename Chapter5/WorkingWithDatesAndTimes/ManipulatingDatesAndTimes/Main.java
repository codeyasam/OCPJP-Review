/* Manipulating Dates and Times 
*
* The date and time classes are immutable.
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);
        
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(5, 15);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1)
            .minusDays(1).minusHours(10).minusSeconds(30);
        
        LocalDate anotherDate = LocalDate.of(2020, Month.JANUARY, 20);
        anotherDate.plusDays(10);    // date is immutable, this won't affect the date
        System.out.println(anotherDate); // prints January 20, 2020
        
    }
    
}