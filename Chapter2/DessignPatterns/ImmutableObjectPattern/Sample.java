/* Immutable Object Pattern
* experimentation
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

final class Animal {
    
    private final List<String> favoriteFoods;
    
    public Animal(List<String> favoriteFoods) {
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }
    
    public List<String> getFavoriteFoods() {
        return new ArrayList<>(favoriteFoods); //creates a new copy or also can use Collections.unmodifiableList(favoriteFoods);
                                               // or just create a lenght and index for the list 
    }
    
    public static void main(String[] args) {
        List<String> favoriteFoods = Arrays.asList("a", "b", "c");
        Animal animal = new Animal(favoriteFoods);
        List<String> animalFavs = animal.getFavoriteFoods();
        animalFavs.add("d");
        System.out.println(animalFavs);
        System.out.println(animal.getFavoriteFoods());
    }
    
}