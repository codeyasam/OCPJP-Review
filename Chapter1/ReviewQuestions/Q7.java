
class IceCream {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY 
    }
    
    public static void main(String[] args) {
        Flavors f = Flavors.STRAWBERRY;
        switch(f) {
            case 0: System.out.println("vanilla");         // won't compile
            case 1: System.out.println("chocolate");       // won't compile
            case 2: System.out.println("strawberry");      // won't compile
            break;
            default: System.out.println("missing flavor");
        }
    }
}