package abstraction.travel.base;

abstract public class Travel {

    protected int distance;
    protected double basePrice;

    public Travel(int distance, double basePrice) {
        this.distance = distance;
        this.basePrice = basePrice;
    }

    // Parent class defines an abstract protected method with an empty body
    protected abstract double totalPrice();
    protected abstract void information();

    public static void listOfTravelOptions(Travel[] travelOption){
        for (Travel travel : travelOption) {
            travel.information();
        }
    }

    @Override
    public String toString() {
        return "Travel { distance = %d, basePrice = %.2f}".formatted(distance, basePrice);
    }
}
