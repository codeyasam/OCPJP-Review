/* Q2: Which of the following changes when made independently would make this code compile? (Choose all that apply) 
*
* 
1: class StuckTurkeyCage implements AutoCloseable {  
2:    public void close() throws Exception {
3:        throw new Exception("Cage door does not close");
4:    }    
5:    public static void main(String[] args) {
6:        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
7:            System.out.println("put turkeys in");
8:        }
9:    }  
10: }

* B. Add throws Exception to the declaration on line 5.
* C. Change line 8 to } catch (Exception e) {}.
*/

class StuckTurkeyCage implements AutoCloseable {
    
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
    
    public static void main(String[] args) {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
    
}
