/* Generic Interfaces
*
* 3 ways to implement
*/

interface Shippable<T> {
    
    void ship(T t);
    
}

/* specify the generic type in the class. The following concrete class says that it deals only with robots. */

class ShippableRobotCrate implements Shippable<Robot> {
    
    public void ship(Robot robot) {
        
    }
    
}

/* Using generics. The following concrete class allows the caller to specify the type of the generic. */

class ShippableAbstractCrate<U> implements Shippable<U> {
    
    public void ship(U t) {
        
    }
    
}

/* The old way of writing code: generates a compiler warning about Shippable being a raw type, but does compile (Only when called). */

class ShippableCrate implements Shippable {
    
    public void ship(Object t) {
        
    }
    
}

class Robot {}

/* What you can't do with Generic Types 
*
* Call the constructor: new T() is not allowed because at runtime it would be new Object().
* Create an array of that static type: You'd be creating an array of objects.
* Call instanceof: This is not allowed because atruntime List<Integer> and List<String> look the same to Java thanks to type erasure.
* Use a primitive type as a generic type parameter: just use Integer.
* Create a static variable as a generic type parameter. This is not allowed because the type is linked to the instance of the class.
*/

