/* Q18: Which of the following lines can be inserted to make the code compile? */

class A {}
class B extends A {}
class C extends B {}

class D<C> {
    // insert code here
    A a1 = new A();
    A a2 = new B();
    
}