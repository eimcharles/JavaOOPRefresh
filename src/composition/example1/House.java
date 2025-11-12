package composition.example1;

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

    private final String address;
    private Animal animal;


    public House(String address) {
        this.address = address;
    }

    public House(String address, Animal animal) {
        this.address = address;
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "House { address = '%s', animal = %s}".formatted(address, animal);
    }
}
