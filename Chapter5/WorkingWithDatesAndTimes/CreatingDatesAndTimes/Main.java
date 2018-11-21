/* Creating Dates and Times 
*
* The date and time classes have private constructors to force you to use the factory's static methods.
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.ZoneId;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        
        // GMT - subtract the time from the timezone e.g.
        // 2015-06-20T07:50+01:00[Europe/Paris]    // GMT 2015-06-20 5:50
        // 2015-06-20T06:50+05:30[Asia/Kolkata]    // GMT 2015-06-20 1:20
        // After converting to GMT, you can see that the Paris is four and a half hours behind Kolkata time
        
        // another example: PH and US - US is 13 hours behind PH
        // PH: +08:00
        // US: -05:00
        
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        
        LocalTime time1 = LocalTime.of(6, 15);          // hours and minutes'
        LocalTime time2 = LocalTime.of(6, 15, 30);      // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        
        // you can combine dates and times into one object
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        
        // in order to create a ZonedDateTime, we first need to get the desired time zone.
        
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
    }
    
}