/* Q9: What is the result of the following code? 
*/

class Outer {
    private int x = 24;
    public int getX() {
        String message = "x is ";
        class Inner { // Local Inner class
            private int x = Outer.this.x;
            public void printX() {
                System.out.println(message + x);
            }
        }
        
        Inner inner = new Inner();
        inner.printX();
        return x;
    }
    
    public static void main(String[] args) {
        new Outer().getX();
    }
}