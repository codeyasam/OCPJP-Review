/* Q13: Which is a true statement about the following code?
*/

class IsItFurry {
    static interface Mammal {}
    static class Furry implements Mammal {}
    static class Chipmunk extends Furry {}
    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        Mammal m = c;
        Furry f = c;
        int result = 0;
        if (c instanceof Mammal) result += 1;        // is executed
        if (c instanceof Furry) result += 2;         // is executed
        if (null instanceof Chipmunk) result += 4;
        System.out.println(result);                  // prints 3
    }
}