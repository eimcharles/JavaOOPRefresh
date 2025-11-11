package abstraction.humans.subClass;

public enum Adaptability {

    // Specifying positive/true or negative/false value
    ADAPTABLE(true),
    NOT_ADAPTABLE(false);

    private final boolean value;

    Adaptability(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

}
