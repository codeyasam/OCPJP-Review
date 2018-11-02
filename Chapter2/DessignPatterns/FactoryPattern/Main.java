/* Factory Pattern
*
* is a creational pattern based on the idea of using a factory class to produce instance of objects based on a set of input parameters.
*
* Food: Pellets, Hay, Fish
* FoodFactory: produces Food
* Client: gets Food from FoodFactory
*/

class ZooKeeper {
    
    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("polar bear");
        food.consumed();
    }
    
}

class FoodFactory {
    public static Food getFood(String animalName) {
        switch(animalName) {
            case "zebra": return new Hay(100);
            case "rabbit": return new Pellet(5);
            case "goat": return new Pellet(30);
            case "polar bear": return new Fish(10);
        }
        
        //Good practice to throw an exception if no matching subclass could be found
        throw new UnsupportedOperationException("Unsupported animal: " + animalName);
    }
}

abstract class Food {
    
    private int quantity;
    
    public Food(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public abstract void consumed();
}

class Hay extends Food {
    
    public Hay(int quantity) {
        super(quantity);
    }
    
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
    
}

class Pellet extends Food {
    
    public Pellet(int quantity) {
        super(quantity);
    }
    
    public void consumed() {
        System.out.println("Pellets eaten: " + getQuantity());
    }
    
}

class Fish extends Food {
    public Fish(int quantity) {
        super(quantity);
    }
    
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());
    }
}