/* Q16: Which of the following can be inserted in main?
*
*/

class Outer {
    class Inner {}
    
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner(); // will compile
    }
}