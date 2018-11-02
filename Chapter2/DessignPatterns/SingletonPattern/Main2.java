/* Singleton: Instantiation using a static block
*
* it is initialized when the class is loaded
*/

class StaffRegister {
    
    private static final StaffRegister instance;
    
    static {
        instance = new StaffRegister();
        // Perform additional steps
        System.out.println("class is loaded.");
    }
    
    private StaffRegister() {}
    
    public static StaffRegister getInstance() {
        return instance;
    }
    
    public static void main(String[] args) {
        System.out.println("main method executed.");
    }
}