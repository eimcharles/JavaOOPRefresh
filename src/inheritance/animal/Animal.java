package inheritance.animal;

public class Animal {

    protected AnimalType type;

    public Animal(){}

    public Animal(AnimalType type) {
        this.type = type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal { type = %s}".formatted(type);
    }

    public String makeNoise() {
        return "Make noise method in Animal class";
    }

}
