package encapsulation.matchingWords;

import java.util.Objects;

public class CharacterMatchCounter {

    private String firstWord;
    private String secondWord;
    private int numberOfMatchingCharacters;

    public CharacterMatchCounter(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.numberOfMatchingCharacters = 0;
    }

    public CharacterMatchCounter(CharacterMatchCounter word){
        this.firstWord = word.firstWord;
        this.secondWord = word.secondWord;
        this.numberOfMatchingCharacters = word.numberOfMatchingCharacters;;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }


    public void setNumberOfMatchingCharacters(int numberOfMatchingCharacters) {
        this.numberOfMatchingCharacters = numberOfMatchingCharacters;
    }

    public int getNumberOfMatchingCharacters(){

        // for each character in the first word
        for (int i = 0; i < firstWord.length(); i++) {

            // Check the letter at index i in first word and check if character is present in second word
            // return index of the position of the first occurrence of the character.
            if (this.secondWord.indexOf(this.firstWord.charAt(i)) >= 0) {

                // Increment the counter is letter is first work is present in second word
                this.numberOfMatchingCharacters++;
            }
        }
        return this.numberOfMatchingCharacters;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CharacterMatchCounter that = (CharacterMatchCounter) o;
        return numberOfMatchingCharacters == that.numberOfMatchingCharacters &&
                Objects.equals(firstWord, that.firstWord) &&
                Objects.equals(secondWord, that.secondWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstWord, secondWord, numberOfMatchingCharacters);
    }

    @Override
    public String toString() {
        return " MatchingWords { firstWord = '%s', secondWord = '%s', matchingLetters = %d}".formatted(firstWord, secondWord, numberOfMatchingCharacters);
    }
}
