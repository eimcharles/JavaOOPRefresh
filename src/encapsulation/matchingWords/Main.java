package encapsulation.matchingWords;

public class Main {

    public static void main(String[] args) {

        CharacterMatchCounter characterMatchCounter;
        int numberOfMatchingCharacters;

        characterMatchCounter = new CharacterMatchCounter("Hellow", "Yellow");
        numberOfMatchingCharacters = characterMatchCounter.getNumberOfMatchingCharacters();
        System.out.println(numberOfMatchingCharacters);

        characterMatchCounter = new CharacterMatchCounter("Bob", "larry");
        numberOfMatchingCharacters = characterMatchCounter.getNumberOfMatchingCharacters();
        System.out.println(numberOfMatchingCharacters);

    }
}
