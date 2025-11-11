package abstraction.humans.subClass;

public enum Vegetarian {

    // Specifying positive/true or negative/false value
    VEGETARIAN(true),
    NON_VEGETARIAN(false);

    private final boolean value;

    Vegetarian(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
