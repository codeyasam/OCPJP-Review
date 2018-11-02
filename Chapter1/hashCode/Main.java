/* hashCode
* Whenever you override equals(), you are also expected to override hashCode()
* The hashCode is used when storing the object as a ke in a map
*
* Java Doc Contract for hashCode
*  Within the same program, the result of hashCode() must not change. 
*     e.g. name is fine, but weight is not since weight changes regularly
*  If equals method returns true when called with two objects, calling hashCode() on each of those objects muste return the same result.
* 
*/

public class Main {
    
}

/* Practice: Deck of Cards
* Asking for specific cards and retrieving it as quick as possible
*
* a Card has: rank and suit
* a card is equal: has same rank and same suit
* a card go in the same pile: has the same rank
*/

class Card {
    
    private String rank;
    private String suit;
    
    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false;
        Card anotherCard = (Card) obj;
        return rank.equals(anotherCard.rank) && suit.equals(anotherCard.suit);
    }
    
    public int hashCode() {
        return rank.hashCode();
    }
    
}



