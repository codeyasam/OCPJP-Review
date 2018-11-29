/* Q19: What statements about the following class definition are true? (Choose all that apply.) 
*
* A. it compiles without issue.
* F. At most one instance of TicketManager will be created in the application
*/

class TicketManager {
    private TicketManager() { super(); }
    private static TicketManager instance;
    public static synchronized TicketManager getInstance() { // k1
        if (instance == null) instance = new TicketManager(); // k2
        return instance;
    }
    
    private int tickets;
    public int getTicketCount() { return tickets; }
    public void makeTicketsAvailable(int value) { tickets += value; } // k3
    public void sellTickets(int value) {
        synchronized(this) {   // k4
            tickets -= value;
        }
    }
}