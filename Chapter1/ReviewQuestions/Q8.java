/* Q8: What is the result of the following code?
*/

class Outer {
    private int x = 5;
    protected class Inner {
        public static int x = 10;   // won't compile - Member Inner class cant define static fields or methods
        public void go() {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner = out.new Inner();
        in.go();
    }
}