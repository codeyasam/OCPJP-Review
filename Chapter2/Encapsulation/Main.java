/* Encapsulation
*
* is the idea of combining fields and methods in a class such that the methods operate on the data, as oppossed to the users of the class * * * accessing the fields directly.
*
* commonly the use of private instance members
*/

class Animal {
    private String species;
    private int age;
    
    public Animal(String species, int age) {
        this.setSpecies(species);
        this.setAge(age);
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        if (species == null || species.trim().length() == 0) {
            throw new IllegalArgumentException("Species is required.");
        }
        this.species = species;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be a negative number.");
        }
        this.age = age;
    }
}