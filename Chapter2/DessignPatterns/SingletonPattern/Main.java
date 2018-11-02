/* Singleton Pattern
*
* is a creational pattern focused on creating only one instance of an object in memory within an application, sharable by all classes
* and threads within the application.

* synchronized prevent two processes from running the same method at the exact same time.
*/

class HayStorage {
    
    private int quantity = 0;
    private HayStorage() {}    // marking the constructor private
    
    private static final HayStorage instance = new HayStorage();
    
    public static HayStorage getInstance() {
        return instance;
    }
    
    public synchronized void addHay(int amount) {
        quantity += amount;
    }
    
    public synchronized boolean removeHay(int amount) {
        if (quantity < amount) return false;
        quantity -= amount;
        return true;
    }
    
    public synchronized int getHayQuantity() {
        return quantity;
    }
    
}

class LlamaTrainer {
    
    public boolean feedLlamas(int numberOfLlamas) {
        int amountNeeded = 5 * numberOfLlamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getHayQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed) System.out.println("Llamas have been fed.");
        return fed;
    }
    
}