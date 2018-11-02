/* Builder Pattern: packaged it in one
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Sample {
    
    public static void main(String[] args) {
        Animal animal = new Animal.AnimalBuilder()
            .setSpecies("lion")
            .setAge(7)
            .setFavoriteFoods(Arrays.asList("a", "b", "c"))
            .build();
        
        System.out.println(animal);
    }
    
}

final class Animal {
    
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;
    
    private Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new IllegalArgumentException("favorite foods is required.");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
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
    
    public String getFavoriteFoods(int index) {
        return favoriteFoods.get(index);
    }
    
    @Override
    public String toString() {
        return "species: " + species + ", age: " + age + ", favoriteFoods: " + favoriteFoods;
    }
    
    public static class AnimalBuilder {
        
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
    
}