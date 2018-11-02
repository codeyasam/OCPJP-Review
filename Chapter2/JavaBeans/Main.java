/* JavaBeans
*
* Encapsulation is so prevalent in Java that there is a standard for creating classes that store data, called JavaBeans
* A design principle for encapsulating data in an object in Java.

* Rules
* Properties are private:                                  private int age;
* Getter for non boolean properties begins with get:       public int getAge() { return age; }
* Getter for boolean may begin with is or get:             public boolean isBird() { return bird; }
                                                           public boolean getBird() { return bird; }    
* Setter methods begin with set:                           public void setAge(int age) { this.age = age; }
* The method name must have a prefix of set/get/is 
* followed by the first letter of the 
* property in uppercase and followed by the
* rest of the property name:                               public void setNumChildren(int numChildren) { this.numberChildren = numChildren; }                              

********************** Although boolean values use is/get to start their getter method, the same does not apply to instance of 
********************** the wrapper Boolean class, which use get. 
*/

public class Main {
    
    private boolean playing;
    private Boolean dancing;
    
    public boolean isPlaying() {
        return playing;
    }
    
    public boolean getPlaying() {
        return playing;
    }
    
    public Boolean getDancing() { // only "get" for Boolean wrapper classes 
        return dancing;
    }
    
}