package symbolTable;

public enum STNodeType {
    RESERVED_WORD("rw"), CHAR("c"), SHORT("sh"), INT("i"), LONG( "l"), FLOAT("f"), DOUBLE("d");

    private final String value;

    private STNodeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
};