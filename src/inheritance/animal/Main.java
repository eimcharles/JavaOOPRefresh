package inheritance.animal;

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

        animal = new Animal();
        animal.setType(AnimalType.DOG);
        System.out.println(animal);
        System.out.println(animal.makeNoise());
        System.out.println();

        dog = new Dog(AnimalType.DOG, "Finn", 5);
        System.out.println(dog);
        System.out.println(dog.makeNoise());
        System.out.println();

        // makeNoise method is not overridden by goldenRetriever, calls the parent Dog class makeNoise
        goldenRetriever = new GoldenRetriever(AnimalType.DOG, "Lassy", 8);
        System.out.println(goldenRetriever);
        System.out.println(goldenRetriever.makeNoise());

    }
}
