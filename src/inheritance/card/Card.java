package inheritance.card;

import java.util.Objects;

public class Card {

    protected String occasion;
    protected String message;

    public Card(String occasion, String message) {
        this.occasion = occasion;
        this.message = message;
    }

    public Card(Card card){
        this.occasion = card.occasion;
        this.message = card.message;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(occasion, card.occasion) && Objects.equals(message, card.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occasion, message);
    }

    @Override
    public String toString() {
        return "Card { occasion = '%s', message = '%s'}".formatted(occasion, message);
    }
}
