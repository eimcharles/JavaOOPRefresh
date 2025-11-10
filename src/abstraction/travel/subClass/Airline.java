package abstraction.travel.subClass;

import abstraction.travel.base.Travel;

import java.util.Objects;

public class Airline extends Travel {

    // Constant values - immutable
    private final int NUMBER_OF_PASSENGERS;
    private final boolean IS_BUSINESS_CLASS;

    public Airline(int distance, double basePrice, int NUMBER_OF_PASSENGERS, boolean IS_BUSINESS_CLASS) {
        super(distance, basePrice);
        this.NUMBER_OF_PASSENGERS = NUMBER_OF_PASSENGERS;
        this.IS_BUSINESS_CLASS = IS_BUSINESS_CLASS;
    }

    // Child class implements the parent abstract method
    @Override
    public double totalPrice() {
        if (IS_BUSINESS_CLASS) {
            return this.BASE_PRICE * 2.5 + 1000;
        } else {
            return this.BASE_PRICE + 1000;
        }
    }

    // Child class implements the parent abstract method
    @Override
    public void information() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nThe distance of travel is ").append(this.distance)
                .append(" km and the number of passengers is ").append(this.NUMBER_OF_PASSENGERS)
                .append("\nThe base price is ").append(this.BASE_PRICE)
                .append(" and the ticket is Business: ").append(this.IS_BUSINESS_CLASS)
                .append("\nThe total expense is ").append(this.totalPrice());

        System.out.println(sb);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return NUMBER_OF_PASSENGERS == airline.NUMBER_OF_PASSENGERS && IS_BUSINESS_CLASS == airline.IS_BUSINESS_CLASS;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NUMBER_OF_PASSENGERS, IS_BUSINESS_CLASS);
    }
}
