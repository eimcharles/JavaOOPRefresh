package abstraction.travel.subClass;

import abstraction.travel.base.Travel;

import java.util.Objects;

public class Airline extends Travel {

    // Constant values - immutable
    private final int numberOfPassengers;
    private final boolean isBusinessClass;

    public Airline(int distance, double basePrice, int numberOfPassengers, boolean isBusinessClass) {
        super(distance, basePrice);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    // Child class implements the parent abstract method
    @Override
    public double totalPrice() {
        if (isBusinessClass) {
            return this.basePrice * 2.5 + 1000;
        } else {
            return this.basePrice + 1000;
        }
    }

    // Child class implements the parent abstract method
    @Override
    public void information() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nThe distance of travel is ").append(this.distance)
                .append(" km and the number of passengers is ").append(this.numberOfPassengers)
                .append("\nThe base price is ").append(this.basePrice)
                .append(" and the ticket is Business: ").append(this.isBusinessClass)
                .append("\nThe total expense is ").append(this.totalPrice());

        System.out.println(sb);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return numberOfPassengers == airline.numberOfPassengers && isBusinessClass == airline.isBusinessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPassengers, isBusinessClass);
    }
}
