package mouse;

import cat.BigCat;

public class Mouse {
    
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);    // will compile     (it is public)
        System.out.println(cat.hasFur);  // will not compile (not on the same package, and BigCat is the parent class)
        System.out.println(cat.hasPaws); // will not compile (not on the same package)
        System.out.println(cat.id);      // will not compile (it is private, not within the class) 
    }
    
}