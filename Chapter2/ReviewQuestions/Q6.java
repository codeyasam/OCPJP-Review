/* Q6: What is the result of the following class?
*/

import java.util.function.Predicate;

class Panda {
    int age;
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5);  // prints match
    }
    
    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);      // prints match
    }
}