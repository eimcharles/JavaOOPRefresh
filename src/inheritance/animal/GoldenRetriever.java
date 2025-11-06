package inheritance.animal;

public class GoldenRetriever extends Dog {

    private String colour;

    public GoldenRetriever(AnimalType type, String dogName, int dogAge) {
        super(type, dogName, dogAge);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "GoldenRetriever { type = %s , dogName = '%s', colour = '%s', dogName = '%s'}".formatted(colour, dogName, dogAge, type);
    }
}