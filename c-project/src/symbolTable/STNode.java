package symbolTable;

public class STNode<T> implements Comparable<T> {
    private STNodeType type;
    private T value = null;
    private Scope nodeScope = null;


    public STNode(STNodeType type, T value) {
        this.type = type;
        this.value = value;
    }

    public STNode(STNodeType type) {
        this.type = type;
    }

    public STNode(STNodeType type, Scope nodeScope) {
        this(type);
        this.nodeScope = nodeScope;
    }

    public STNode(STNodeType type, T value, Scope nodeScope) {
        this(type, value);
        this.nodeScope = nodeScope;
    }

    public STNode(STNode node) {
        this(node.getType(), (T) node.getValue(), node.getNodeScope());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Scope getNodeScope() {
        return nodeScope;
    }

    public void setNodeScope(Scope nodeScope) {
        this.nodeScope = nodeScope;
    }

    public STNodeType getType() {
        return type;
    }

    public void setType(STNodeType type) {
        this.type = type;
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return value.toString();
    }

};
