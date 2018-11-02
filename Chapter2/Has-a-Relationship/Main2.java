/* Uncovering problems with Is-a and Has-a: solution
*
* Monkeys and Chimpanzees are Primate
* Monkeys has tail, Chimpanzees doesn't have
*/

class Tail {}
class Primate {}

class Monkey extends Primate {
    private Tail tail;
}
class Chimpanzee extends Primate {}