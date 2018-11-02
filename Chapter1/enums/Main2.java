/* Enum with Constructors, Fields, and Methods
*
* Keep tract of traffic patterns for which seasons get the most visitors
*/

enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    
    private String expectedVisitors;
    
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
    
    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors(); // prints the expected visitors
    }
}

enum OnlyOne {
    ONCE(true);
    
    private OnlyOne(boolean b) {
        System.out.println("constructing...");
    }
    
    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing
        OnlyOne secondCall = OnlyOne.ONCE;  // doesn't print anything
    }
}

/* abstract method in enum
* each and every enum is required to implement this method.
*/

enum Season2 {
    WINTER {
        public void printHours() { System.out.println("9am-3pm"); }
    }, SPRING {
        public void printHours() { System.out.println("9am-5pm"); }
    }, SUMMER {
        public void printHours() { System.out.println("9am-7pm"); }
    }, FALL {
        public void printHours() { System.out.println("9am-5pm"); }
    };
    public abstract void printHours();
}

enum Season3 {
    WINTER {
        public void printHours() { System.out.println("short hours"); }
    }, SUMMER {
        public void printHours() { System.out.println("long hours"); }
    }, SPRING, FALL;
    
    public void printHours() {
        System.out.println("default hours");
    }
}