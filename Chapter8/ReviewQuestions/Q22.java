/* Q22: What is the value of name after an instance of Eagle is serialized and then deserialized?

public class Bird implements Serializable {
    protected transient String name = "Bridget";
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public Bird() {
        this.name = "Matt";
    }
}

public class Eagle extends Bird implements Serializable {
    {
        this.name = "Jannette"; 
    }
    
    public Eagle() {
        this.name = "Daniel";
    }
}

* E. null
*/


class Q22 {
    {
        System.out.println("Initializer");
    }
    
    public Q22() {
        System.out.println("constructor");
    }
    
    public static void main(String[] args) {
        new Q22();
    }
}