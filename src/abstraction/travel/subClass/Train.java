package abstraction.travel.subClass;

import abstraction.travel.base.Travel;

import java.util.Objects;

public class Train extends Travel {

    // Constant values - immutable
    private final int TRAIN_FARE;
    private final boolean IS_SEPARATE_CABIN;

    public Train(int distance, double basePrice, int TRAIN_FARE, boolean IS_SEPARATE_CABIN) {
        super(distance, basePrice);
        this.TRAIN_FARE = TRAIN_FARE;
        this.IS_SEPARATE_CABIN = IS_SEPARATE_CABIN;
    }

    // Child class implements the parent abstract method
    @Override
    public double totalPrice() {
        return this.BASE_PRICE + TRAIN_FARE * 1.3 + 1000;
    }

    @Override
    // Child class implements the parent abstract method
    public void information() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nThe distance of travel is ").append(this.distance)
                .append("\nAnd travel is in a Separate Cabin: ").append(this.IS_SEPARATE_CABIN)
                .append("\nThe total expense is ").append(this.totalPrice());

        System.out.println(stringBuilder);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return TRAIN_FARE == train.TRAIN_FARE && IS_SEPARATE_CABIN == train.IS_SEPARATE_CABIN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TRAIN_FARE, IS_SEPARATE_CABIN);
    }
}
