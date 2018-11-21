/* Q7: What is the output of the following code?
*
* LocalDate date = LocalDate.parse("2018-04-03", DateTimeFormatter.ISO_LOCAL_DATE);
* date.plusDays(2);
* date.plusHours(1); // won't compile
* System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

* D. The code does not compile. (due to plusHours)
*/