package inheritance.animal;

import inheritance.animal.base.Animal;
import inheritance.animal.base.AnimalType;
import inheritance.animal.subClass.Dog;
import inheritance.animal.subClass.GoldenRetriever;

public class Main {

    /**
     *      The Parent object
     *      cannot call the child method that
     *      overrides its own method, it cannot see it.
     * */

    public static void main(String[] args) {

        Animal animal;
        Dog dog;
        GoldenRetriever goldenRetriever;

        // Creating an Animal object and calling the parent makeNoise() method
        animal = new Animal();
        animal.setType(AnimalType.DOG);
        System.out.println(animal);
        System.out.println(animal.makeNoise());
        System.out.println();

        // Creating a Dog object and calling the child makeNoise() method
        dog = new Dog(AnimalType.DOG, "Finn", 5);
        System.out.println(dog);
        System.out.println(dog.makeNoise());
        System.out.println();

        // Creating an goldenRetriever object that does not override the parent makeNoise() method - calls the parent Dog class makeNoise() method
        goldenRetriever = new GoldenRetriever(AnimalType.DOG, "Lassy", 8, "Golden");
        System.out.println(goldenRetriever);
        System.out.println(goldenRetriever.makeNoise());

    }
}
