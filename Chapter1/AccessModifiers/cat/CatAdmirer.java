package cat;

public class CatAdmirer {
    
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);    // will compile     (it is public)
        System.out.println(cat.hasFur);  // will compile     (same package)
        System.out.println(cat.hasPaws); // will compile     (same package)
        System.out.println(cat.id);      // will not compile (not within class)
    }
    
}