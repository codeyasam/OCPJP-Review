/* Local Inner Class
*
* a nested class defined within a method
* They do not have an access modifier - (since it's inside the method)
* They cannot be declared static and cannot declare static fields or methods - (like the member inner class since it's not static)
* They do not have access to local variables of a method unless those variables are FINAL or EFFECTIVELY FINAL. 
*/


class Outer {
    
    private int length = 5;
    
    public void calculate() {
        final int width = 20;
        class Inner {
            
            private int test = 3;
            
            public void multiply() {
                System.out.println(length * width * test);
            }
        }
        
        Inner inner = new Inner();
        inner.multiply();
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
    
}

class Testing {
    
    public void isItFinal() {
        int one = 20;             // is effectively final
        int two = one;            // not effectively final since two increments i
        two++;
        int three;                // is effectively final
        if (one == 4) three = 3;
        else three = 4;
        int four = 4;             // not effectively final. even though the assignment happens after the inner class, it is not allowed
        class Inner {
            
        }
        four = 5;
    }
    
}