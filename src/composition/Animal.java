package composition;

import java.util.Objects;

public class Animal {

    protected int age;
    protected String name;
    protected String color;

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Animal(Animal animal){
        this.age = animal.age;
        this.name = animal.name;
        this.color = animal.color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color);
    }

    @Override
    public String toString() {
        return "Animal { age = %d, name = '%s', color = '%s'}".formatted(age, name, color);
    }
}
