/*
*                  Exact Match Type
* Matching a       Super Class Type
* Converting to an Unboxed Type
* Converting to a  Larger Primitive Type
* Converting to an Autoboxed Type
*/

public class Overloading {
    
    // public void sample(Integer i) {
    //     System.out.println("Exact match type");
    // }
    
    // public void sample(Object o) {
    //     System.out.println("Matching a superclass type");
    // }
    
    // public void sample(int i) {
    //     System.out.println("Converting to an unboxed");
    // }
    
    public void sample(double d) {
        System.out.println("larger primitive type");
    }
    
    // public void sample(Integer i) {
    //     System.out.println("Converting to an autoboxed");
    // }    
    
    public void sample(Double d) {
        System.out.println("Converting to an autoboxed");
    }
    
    public static void main(String[] args) {
        Overloading o = new Overloading();
        Integer i = 1;
        //Double i = 1.0;
        //String i = "";
        o.sample(i);
    }
        
}