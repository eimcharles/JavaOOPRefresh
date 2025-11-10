package encapsulation.matchingWords;

public class Main {

    public static void main(String[] args) {

        CharacterMatchCounter characterMatchCounter;
        int numberOfMatchingCharacters;

        // Q1 : checking how many characters are matches in two word using the getNumberOfMatchingCharacters
        characterMatchCounter = new CharacterMatchCounter("Hellow", "Yellow");
        numberOfMatchingCharacters = characterMatchCounter.getNumberOfMatchingCharacters();
        System.out.println(characterMatchCounter.getFirstWord() + " and "  + characterMatchCounter.getSecondWord() + " have " + numberOfMatchingCharacters + " matching characters ");

        // Q1 : checking how many characters are matches in two word using the getNumberOfMatchingCharacters
        characterMatchCounter = new CharacterMatchCounter("Bob", "larry");
        numberOfMatchingCharacters = characterMatchCounter.getNumberOfMatchingCharacters();
        System.out.println(characterMatchCounter.getFirstWord() + " and "  + characterMatchCounter.getSecondWord() + " have " + numberOfMatchingCharacters + " matching characters ");

    }
}
