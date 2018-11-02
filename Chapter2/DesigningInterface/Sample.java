
interface Fly {
    
    public static void getWingSpan() throws Exception { // compiles successfully
        System.out.println("getWingSpan");
    }
    
}

interface FlyHigh extends Fly {
    
    public static void getWingSpan() { // compiles successfully
        
    }
    
}

class Sample implements Fly {
    
    public static void main(String[] args) throws Exception {
        Fly.getWingSpan();
    }
    
}