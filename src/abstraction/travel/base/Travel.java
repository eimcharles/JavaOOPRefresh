package abstraction.travel.base;

abstract public class Travel {

    protected int distance;
    protected final double BASE_PRICE;

    public Travel(int distance, double BASE_PRICE) {
        this.distance = distance;
        this.BASE_PRICE = BASE_PRICE;
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
        return "Travel { distance = %d, basePrice = %.2f}".formatted(distance, BASE_PRICE);
    }
}
