/* Q16: Choose the correct statements about the following code
*/

interface Herbivore {
    int amount = 10;
    public static void eatGrass(); // won't compile - static methods in an interface must have a body
    
    public int chew() { // won't compile - implicityly methods in interface are abstract, only "static" and "default" has a body
        return 13;
    }
}