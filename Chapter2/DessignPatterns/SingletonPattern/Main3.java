/*Singleton: Lazy instantiation
*
* delay creation of the singleton until the first time the getInstance() method is called
*/

class VisitorTicketTracker {    
    
    private static VisitorTicketTracker instance;
    private VisitorTicketTracker() {}
    
    public static VisitorTicketTracker getInstance() { // marking this with synchronized will make this thread safe but will require synchronization to every single call
        if (instance == null) {
            instance = new VisitorTicketTracker();  // NOT THREAD SAFE 
        }
        return instance;
    }
    
    
}