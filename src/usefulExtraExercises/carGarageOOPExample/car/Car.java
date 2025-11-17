package usefulExtraExercises.carGarageOOPExample.car;

import java.time.Year;
import java.util.Objects;

public class Car {

    private Brand brand;
    private Model model;
    private Year modelYear;
    private String licensePlateNumber;

    public Car(Brand brand, Model model, Year modelYear, String licensePlateNumber) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.licensePlateNumber = licensePlateNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Year getModelYear() {
        return modelYear;
    }

    public void setModelYear(Year modelYear) {
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
        return "Car { brand = '%s', model = '%s', modelYear = %d, licensePlateNumber = '%s'}".formatted(brand, model, modelYear.getValue(), licensePlateNumber);
    }
}
