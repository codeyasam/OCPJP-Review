

abstract class Cat {
    /*
    * The 'name' field can be marked with static / final
    * Child class can inherit the static field
    * Child class won't be able to modify final field
    */
    String name = "The Cat"; 
    
    // could define nothing at all
    
    // could create an abstract method
        /*  
        *  abstract void sample();
        */
    
    // could create a method with default implementation
        /*
        * void sample () {
        *
        * }
        */
    
    /*
    * static cannot be added independently to parent or child method
    * adding both would be possible, but then it wouldn't be inheriting the method
    * final cannot be added to the parent's method, the subclass would no longer be able to override it
    */
    void clean() {
        
    }
}

/*
* Final prevents a variable from changing, method from being overriden, class from being subclassed
* static makes a variable shared at the class level, same with method, static classes are used in nested classes
*/