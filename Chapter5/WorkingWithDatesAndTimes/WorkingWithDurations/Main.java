/* Working with Duration 
*
* Period is a day or more time.
* Duration is intended for smaler units of time. 
*
* You can specify the number of days, hours, minutes, seconds, or nanoseconds. 
* It is used with objects that have time.
*
* Duration is output beginning with PT. you can think of as a period of time.
* Duration is stored in hours, minutes, seconds.
*/

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);                         // PT24H
        Duration hourly = Duration.ofHours(1);                       // PT1H
        Duration everyMinute = Duration.ofMinutes(1);                // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10);           // PT10S
        Duration everyMilli = Duration.ofMillis(1);                  // PT0.001S
        Duration everyNano = Duration.ofNanos(1);                    // PT0.000000001S
        
        // Duration doesn't have a constructor that takes multiple units like Period.
        // Temporal is an interface and has currently one implementation - ChronoUnit
        
        // the example above could be rewritten as this:
        daily = Duration.of(1, ChronoUnit.DAYS);
        hourly = Duration.of(1, ChronoUnit.HOURS);
        everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        everyTenSeconds =Duration.of(10, ChronoUnit.SECONDS);
        everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        everyNano = Duration.of(1, ChronoUnit.NANOS);
        
        // ChronoUnit also includes some convenient units such as ChronoUnit.HALF_DAYS to represent 12 hours
        // ChronoUnit is a great way to determine how far apart two Temporal values are. Temporal includes LocalDate, LocalTime, and so on.
        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));   // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
        
        // Using Duration works the same way as using Period
        // only applicable to:
        // datetime  - LocalDateTime
        // time      - LocalTime
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration));  // 2015-01-20T12:15
        System.out.println(time.plus(duration));      // 12:15
        System.out.println(date.plus(duration));      // UnsupportedTemporalException
    }
    
}
    
/* Where to use Duration and Period 
*
*                          Can Use With Period                  Can Use With Duration
* LocalDate                Yes                                  No
* LocalDateTime            Yes                                  Yes
* LocalTime                No                                   Yes
* ZonedDateTime            Yes                                  Yes
*/