package composition;

/**
 *      Represents a House object that contains an Animal object.
 *
 *      This class demonstrates composition: a House "has-an" Animal.
 *      The Animal is a part of the House.
 *
 *      The House does not control the creation or destruction of the Animal,
 *      the Animal object is associated to the House object.
 *
 *      A House may or may not have an associated Animal.
 */

public class House {

    private final String ADDRESS;
    private Animal animal;


    public House(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public House(String ADDRESS, Animal animal) {
        this.ADDRESS = ADDRESS;
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "House { address = '%s', animal = %s}".formatted(ADDRESS, animal);
    }
}
