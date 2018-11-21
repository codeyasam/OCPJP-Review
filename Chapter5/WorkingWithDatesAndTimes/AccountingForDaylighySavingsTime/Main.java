/* Accounting for Daylight Savings Time 
*
* Some countries observe daylight savings time. This is where the clocks are adjusted by an hour twice a year to make better use of the sunlight. Not all countries participate, and those that do use different weekends for the change.

* In United State, we move the clocks an hour ahead in March and move them an hour back in November.

* When we change our clocks in March, time springs forward from 1:59am to 3:00am
* When we change our clocks in November, time falls back from 1:59am(first time) to 1:00am
* Children learn this as spring forward in the spring and fall back in the fall

* Another way to look at it is that there is one day in March that is 23 hours long and one day in November that is 25 hours long.
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);              //2016-03-13T01:30-05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);              //2016-03-13T03:30-04:00[US/Eastern] jumps to 3:30 because of daylight savings time
        
        // similarly in november
        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time1 = LocalTime.of(1, 30);
        ZoneId zone1 = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date1, time1, zone1);
        System.out.println(zonedDateTime1);            //2016-11-06T01:30-04:00[US/Eastern]
        zonedDateTime1 = zonedDateTime1.plusHours(1);
        System.out.println(zonedDateTime1);            //2016-11-06T01:30-05:00[US/Eastern] 
        zonedDateTime1 = zonedDateTime1.plusHours(1);
        System.out.println(zonedDateTime1);            //2016-11-06T02:30-05:00[US/Eastern]
    }
    
}


