/* Formatting Dates and Times 
* 
* DateTimeFormatter - java.time.format.DateTimeFormatter
*/

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 14);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        // ISO is a standard for dates
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        
        // predefined formats that are more useful
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date));     // 1/20/20
        //System.out.println(shortDateTime.format(time));     // UnsupportedTemporalTypeException
    
        System.out.println(date.format(shortDateTime));
        System.out.println(dateTime.format(shortDateTime));
        
        // There are two predefined format that can show up on the exam: SHORT and MEDIUM
        date = LocalDate.of(2020, Month.JANUARY, 20);
        time = LocalTime.of(11, 12, 34);
        dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime));                                     // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime));                                    // Jan 20, 2020 11:12:34 AM  
        
        // creaing your own
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));                                          // January 20, 2020, 11:12
        
        // parsing dates
        f = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 2015", f);
        time = LocalTime.parse("11:22");
        System.out.println(date);            // 2015-01-02 
        System.out.println(time);            // 11:22
    }
    
}

/*
* DateTimeFormatter f =                   Calling f.format(localDate)     Calling f.format(localDateTime)or       Calling f.format(localTime)
DateTimeFormatter                                                                 (zonedDateTime)  
.__________(FormatStyle.SHORT)         
* ofLocalizedDate                         Legal - shows whole object      Legal - shows just date part            throws runtime exception
* ofLocalizedDatetime                     throws runtime exception        Legal - shows whole object              throws runtime exception
* ofLocalizedTime                         throws runtime exception        Legal - shows just time part            Legal - shows whole object
*/