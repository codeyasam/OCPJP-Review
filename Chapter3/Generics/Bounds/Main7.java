/* Generics: Putting it all together
*/

import java.util.List;
import java.util.ArrayList;

public class Main7 {
    
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
        List<? extends B> list4 = new ArrayList<A>(); // WON'T COMPILE
        List<? super B> list5 = new ArrayList<A>();
        List<?> list6 = new ArrayList<? extends A>(); // WON'T COMPILE the initialization is not valid
    }
    
}

class A {}
class B extends A {}
class C extends B {}

class AnotherSample<T, X> {
    
    private T t;
    private X x;
    
    <T> T method1(List<? extends T> list) { // perfectly valid
        return list.get(0);
    }
    
    static <T> T method1Other(List<? extends T> list) { // perfectly valid
        return list.get(0);
    }
    
    //<T> <? extends T> method2(List<? extends T> list) { // WON'T COMPILE - return type is not specified correctly/valid
    //    return list.get(0);
    //}
    
    <B extends A> B method3(List<B> list) {
        return new B();                        // WON'T COMPILE - B no longer refers to the B clas in the method, you can't instantiate it.
    }
    
    void method4(List<? super B> list) {
        
    }
    
    //<X> void method5(List<X super B> list) {  // WON'T COMPILE - it tries to mix a method-specific type parameter with a wildcard. A wildcard must have a ? in it.
        
    //}
}