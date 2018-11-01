/* Q20: What is the result of the following code?
*/

class FourLegged {
    String walk = "walk,";
    static class BabyRhino extends FourLegged {
        String walk = "toddle,";
    }
    
    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }
}