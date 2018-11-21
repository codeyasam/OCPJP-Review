/* Q10: What is the output ofthe following code?
* 
* LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
* Period p = Period.of(1, 2, 3);
* d = d.minus(p);
* DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
* System.out.println(d.format(f));

* E. 11:22 AM
*/