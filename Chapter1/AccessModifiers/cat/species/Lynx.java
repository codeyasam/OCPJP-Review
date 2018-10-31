package cat.species;

import cat.BigCat;

public class Lynx extends BigCat {
    
    public static void main(String[] args) {
        Lynx lynxCat = new Lynx();
        System.out.println(lynxCat.name);    // will compile (it is public)        
        System.out.println(lynxCat.hasFur);  // will compile (Lynx is a subclass and a reference using accessing protected hasFur)
                                                              // even not on the same package
        BigCat cat = new BigCat();  
        System.out.println(cat.name);        // will compile     (it is public)
        System.out.println(cat.hasFur);      // will not compile (not on the same package and BigCat is the parent class (NOT a subclass))
        System.out.println(cat.hasPaws);     // will not compile (not on the same package)
        System.out.println(cat.id);          // will not compile (it is private, not within the class) 
    }
    
}