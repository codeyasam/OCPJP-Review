/* Q7: What changes need to be made to make the following immutable object pattern correct?
*
* Mark name final and private: private final String name;
* Replace the getFriends() method with methods that do not give the caller direct access to the List<Seal> friends:      
     Collections.unmodifiedList(friends) or create two methods: getCount and getByIndex
* Make a copy of the List<Seal> friends in the constructor: this.friends = new ArrayList<>(friends);
* Mark the Seal class final: final class Seal {}
*/

import java.util.List;

class Seal {
    String name; 
    private final List<Seal> friends;
    
    public Seal(String name, List<Seal> friends) {
        this.name = name;
        this.friends = friends;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Seal> getFriends() {
        return friends;
    }
}