/* Immutable Object Pattern
*
* a creational pattern based on the idea of creating objects whose state does not change after they are created and can be easily shared 
* across multiple classes.
*
* Immutable Strategy
* Use a constructor to set all propertiesof the object
* Mark all fo the instance variables private and final
* Don't define any setter methods
* Dont allow referenced mutable objects to be modified or accessed directly
* Prevent methods from being overriden
*/

final class Animal {
    
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;
    
    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods); // creates a copy to prevent the caller from changing the list
    }
    
    public String getSpecies() {
        return species;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }
    
    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
}