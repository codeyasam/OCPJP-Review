/* What is the result of the following code?
*/

class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }
    
    public static void main(String[] args) {
        System.out.println(Flavors.CHOCOLATE.ordinal());  // prints 1
    }
}



