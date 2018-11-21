/* Working With Instants 
*
* The Instant classs represents a specific moment in time in the GMT time zone.
*/

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Duration;

public class Main {
    
    public static void main(String[] args) {
        Instant now = Instant.now();
        // do some delay
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());
        
        // if you have a ZonedDateTime, you can turn it into an Instant:
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015-05-25T15:55:00Z
        System.out.println(zonedDateTime);           // 2015-05-25T11:55-04:00[US/Eastern]
        System.out.println(instant);                 // 2015-05-25T15:55:00Z
    }
    
}