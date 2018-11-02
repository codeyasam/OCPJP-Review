/* Singleton: Double-Checked Locking
*
* a design pattern which we first test if synchronization is needed before acutally acquiring any locks. 

* volatile: prevents subtle case where the compiler tries to optimize the code such that the object is accessed before it is finished
* being constructed
*/

class VisitorTicketTracker {
    
    private static volatile VisitorTickerTracker instance;
    private VisitorTicketTracker() {}
    
    public static VisitorTicketTracker getInstance() {
        if (instance == null) {
            synchronized(VisitorTickerTracker.class) {
                if (instance == null) {
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }
    
}