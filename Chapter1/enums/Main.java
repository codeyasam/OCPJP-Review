/* Enums
* it is common to have a type that can only have a finite set of values.
* you CAN NOT extend an enum
*/


enum Season {
    WINTER, SPRING, SUMMER, FALL
}

public class Main {
    
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
        
        /*
        * enum provides a method to get an array of all of the values
        */
        
        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
        
        Season s1 = Season.valueOf("SUMMER");  // returns SUMMER (valueOf returns an IllegalArgumentException if no enum value with given argument)
        System.out.println(s1);
        
        /*
        * enums with switch statements
        */
        
        Season summer = Season.SUMMER;
        switch(summer) {
            case WINTER: 
                System.out.println("winter is here.");
                break;
            case SUMMER:
                System.out.println("Time forthe pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
    
}