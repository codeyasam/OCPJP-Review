/* Static Nested Class
*
* It CANNOT access instance variables of the Enclosing class without an explicity object of the enclosing class.
* The nesting creates a namespace because the enclosing class name must be used to refer to it.
* It can be made private or use one of the other access modifiers to encapsulate it.
* The enclosing class can refer to the fields and methodsof the static nested class, even the private ones.

* Importing a static nested class is interesting:
*    can be imported using a regular import e.g import bird.Toucan.Beak;
*    can be imported using a static import e.g. import static bird.Toucan.Beak;
*/

class Enclosing {
    
    static class Nested {
        
        private int price = 7;
        
    }
    
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
    
}