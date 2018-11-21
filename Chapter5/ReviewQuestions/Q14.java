/* Q14: Note that March 13, 2016, is the weekend that we spring forward, and November 6, 2016, is when we fall back for daylight savings time. Which of the following can fill in the blank without the code throwing an exception? 
*
* ZoneId zone = ZonedId.of("US/Eastern");
* LocalDate date = _______________________
* LocalTime time = LocalTime.of(2, 15);
* ZonedDateTime a = ZonedDateTime.of(date, time, zone);

* A. LocalDate.of(2016, 3, 13);
* C. LocalDate.of(2016, 11, 6);
* D. LocalDate.of(2016, 11, 7);
*/