package abstraction.travel.subClass;

import abstraction.travel.base.Travel;

import java.util.Objects;

public class Train extends Travel {

    // Constant values - immutable
    private final int trainFare;
    private final boolean isSeparateCabin;

    public Train(int distance, double basePrice, int trainFare, boolean isSeparateCabin) {
        super(distance, basePrice);
        this.trainFare = trainFare;
        this.isSeparateCabin = isSeparateCabin;
    }

    // Child class implements the parent abstract method
    @Override
    public double totalPrice() {
        return this.basePrice + trainFare * 1.3 + 1000;
    }

    @Override
    // Child class implements the parent abstract method
    public void information() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nThe distance of travel is ").append(this.distance)
                .append("\nAnd travel is in a Separate Cabin: ").append(this.isSeparateCabin)
                .append("\nThe total expense is ").append(this.totalPrice());

        System.out.println(stringBuilder);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainFare == train.trainFare && isSeparateCabin == train.isSeparateCabin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainFare, isSeparateCabin);
    }
}
