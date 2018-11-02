/* Unnecessary Complexity: Demo purposes for multi-level inner classes
*/

class A {
    private int x = 10;
    class B {
        private int x = 20;
        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(x);        // prints 30
                System.out.println(this.x);   // prints 30
                System.out.println(B.this.x); // prints 20
                System.out.println(A.this.x); // prints 10
            }
        }
    }
    
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        B b2 = a.new B(); //still possible, not applicable to C. Too deep
        A.B.C c = b.new C();
        c.allTheX();
    }
}

/*Looks weird but legal*/

class CaseOfThePrivateInterface {
    private interface Secret {
        public void shh();
    }
    
    class DontTell implements Secret {
        public void shh() {}
    }
}