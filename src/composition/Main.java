package composition;

public class Main {

    public static void main(String[] args) {

        House home; Animal animal;

        // Q1 : Create an animal using the animal class
        animal = new Animal(5, "Finn", "Golden");
        System.out.println(animal);
        System.out.println();

        // Q2 : Create a new house and associate an animal object with it
        home = new House("Montreal", animal);
        System.out.println(home);
        System.out.println();

        // Q3 : modify the animals attributes
        System.out.println("Animal after modifying its attributes");
        animal.setAge(6);
        animal.setName("Finn");
        animal.setColor("Golden white");
        System.out.println(animal);
        System.out.println();

        // Q4 : Display the house after modifying the associated animal
        System.out.println("Home after modifying the animal attributes");
        System.out.println(home);
        System.out.println();

        // Q5 : create a home object with no associated animals
        home = new House("Toronto");
        System.out.println(home);

        // Associating an animal to a house with no animals
        home.setAnimal(new Animal(3, "Iggy", "black"));
        System.out.println(home);

    }
}
