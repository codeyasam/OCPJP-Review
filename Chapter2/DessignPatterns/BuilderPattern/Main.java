/* Builder Pattern
*
* The builder pattern is a creational pattern in which paramaters are passed to a builder object, often through method chaining, and 
* an object is generated with a final build call.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Animal animal = new AnimalBuilder()
            .setSpecies("lion")
            .setAge(7)
            .setFavoriteFoods(Arrays.asList("a", "b", "c"))
            .build();
        
        System.out.println(animal);
    }
    
}

class AnimalBuilder {
    
    private String species;
    private int age;
    private List<String> favoriteFoods;
    
    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }
    
    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }
    
    public Animal build() {
        return new Animal(species, age, favoriteFoods);
    }
    
}

final class Animal {
    
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;
    
    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new IllegalArgumentException("favoriteFoods is required.");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }
    
    public String getSpecies() {
        return species;    
    }
    
    public int getAge() {
        return age;
    }
    
    public int getFavoriteFoodCount() {
        return favoriteFoods.size();
    }
    
    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
    
    public String toString() {
        return "species= " + species + ", age=" + age + ", favoriteFoods=" + favoriteFoods;
    }
    
}