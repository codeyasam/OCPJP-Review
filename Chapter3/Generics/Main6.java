/* Legacy Autoboxing
*/

class LegacyAutoboxing {
    
    public static void main(String[] args) {
        java.util.List numbers = new java.util.ArrayList();
        numbers.add(5);             // java automatically autoboxes to an Integer
        int result = result.get(0); // DOES NOT COMPILE since not using generics, Java doesnt know that the list contains an Integer. It just knows that we have an Object. And an Object can't be unboxed into an int
    }
    
}