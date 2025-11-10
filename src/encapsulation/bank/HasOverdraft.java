package encapsulation.bank;

public enum HasOverdraft {

    // Specifying positive/true or negative/false value
    YES(true),
    NO(false);

    private final boolean value;

    HasOverdraft(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
