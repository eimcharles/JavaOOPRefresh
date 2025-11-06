package inheritance.animal;

import java.util.Objects;

public class Dog extends Animal {

    protected String dogName;
    protected int dogAge;

    public Dog(AnimalType type, String dogName, int dogAge) {
        super(type);
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String makeNoise() {
        return "Bark method, in Dog class, that overrides parent makeNoise";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dogAge == dog.dogAge && Objects.equals(dogName, dog.dogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogName, dogAge);
    }

    @Override
    public String toString() {
        return "Dog { name = '%s', age ='%s', type =%s}".formatted(dogName, dogAge, type);
    }
}
