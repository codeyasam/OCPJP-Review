/* Q9: What changes need to be made to make the following singleton pattern correct?
*
* Change the access modifier of cheetahManager from public to private: private static CheetahManager cheetahManager;
* Add synchronized to getCheetahManager(): public static synchronized CheetahManager getCheetahManager() {
*/

class CheetahManager {
    
    public static CheetahManager cheetahManager;
    
    private CheetahManager() {}
    
    public static CheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }
        return cheetahManager;
    }
}