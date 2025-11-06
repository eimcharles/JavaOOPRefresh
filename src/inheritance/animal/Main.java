package inheritance.animal;

public class Main {

    public static void main(String[] args) {

        House home; Animal animal;

        animal = new Animal(5, "Finn", "Golden");
        System.out.println(animal);
        System.out.println();

        // create a new house with the animal object
        home = new House("Montreal", animal);
        System.out.println(home);
        System.out.println();

        System.out.println("Animal after modifying its attributes");
        animal.setAge(6);
        animal.setName("Finn");
        animal.setColor("Golden white");
        System.out.println(animal);
        System.out.println();

        System.out.println("Home after modifying the animal attributes");
        System.out.println(home);
        System.out.println();

        // Home with no animal
        home = new House("Toronto");
        System.out.println(home);

        // Adding an animal to a house with no animals
        home.setAnimal(new Animal(3, "Iggy", "black"));
        System.out.println(home);

    }
}
