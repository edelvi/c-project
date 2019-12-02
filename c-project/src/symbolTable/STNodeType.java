package symbolTable;

public enum STNodeType {
    RESERVED_WORD("rw"), SHORT("s"), INT("i"), LONG("l"), FLOAT("f"), DOUBLE("d"), CHAR("c");

    private final String value;

    private STNodeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
};

