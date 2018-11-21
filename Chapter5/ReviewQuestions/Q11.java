/* Q11: hat is the output of the following code? 
*
* LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
* Period p = Period.ofDays(1).ofYears(2);
* d = d.minus(p);
* DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
* System.out.println(f.format(d));

* B. 5/10/13 11:22 AM
*/