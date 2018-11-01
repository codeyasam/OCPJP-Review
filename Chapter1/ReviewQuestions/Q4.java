/* Q4: What is true about the following code? You may assume city and mascot are never null.
*/

class BaseballTeam {                 // The code compiles BUT hashCode implementation violates the contract
    private String city, mascot;
    private int numberOfPlayers;
    
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballTeam)) {
            return false;
        }
        BaseballTeam other = (BaseballTeam) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }
    
    public int hashCode() {      // violates the contract with equals
        return numberOfPlayers;  // hashCode must not contain a field that changes regularly
    }                            // hashCode must not contain a field not specified in equals
}