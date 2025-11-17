package usefulExtraExercises.carGarageOOPExample;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int modelYear;
    private String licensePlateNumber;

    public Car(String brand, String model, int modelYear, String licensePlateNumber) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelYear == car.modelYear && Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(licensePlateNumber, car.licensePlateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, modelYear, licensePlateNumber);
    }

    @Override
    public String toString() {
        return "Car { brand = '%s', model = '%s', modelYear = %d, licensePlateNumber = '%s'}".formatted(brand, model, modelYear, licensePlateNumber);
    }
}
