/* Q10: Select from the following statements and indicate the order in which they would appear to output 10 lines 
*
* Stream.generate(() -> "1")
* L: .filter(x -> x.length() > 1)
* M: .forEach(System.out::println)
* N: .limit(10)
* O: .peek(System.out::println)

* F. N, M
* limit and a terminal operation - forEach (peek is a intermediate operation)
*/

