/* Nested Classes
*
* Member Inner Class
* Local Inner Class
* Anonymous Inner Class
* Static Nested Class
*/


/* Member Inner Class
*
* can be declared public, private, protected, or use default access
* can extend any class and implement interfaces
* can be abstract or final
* CANNOT declare static fields or methods
* can access members of the outer class including private members
*/
class Outer {
    
    private String greeting = "Hi";
    
    protected class Inner {
        private int repeat = 3;
        
        // a complex way of printing Hi 3 times
        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
        
    }
    
    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        
        //odd way of instantiating Inner
        Outer outer2 = new Outer();
        Inner inner = outer2.new Inner();
        inner.go();
    }
    
}