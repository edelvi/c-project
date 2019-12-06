package symbolTable;

public enum STNodeType {
    RESERVED_WORD("rw"), INT("i"), FLOAT("f"), DOUBLE("d"), CHAR("c"),  SHORT("sh"), LONG( "l") ;

    private final String value;

    private STNodeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
};