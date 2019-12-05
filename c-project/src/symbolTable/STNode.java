package symbolTable;

public class STNode<T> implements Comparable<T> {
    private STNodeType type;
    private Scope scope;
    private T value;

    //No puedo crear un STNode por su valor o por su scope  pq C no infiere tipos

    public STNode(STNodeType type) {
        this.type = type;
        this.value = null;
        this.scope = null;
    }

    
    public STNode(STNodeType type, T value) {
        this.type = type;
        this.value = value;
        this.scope = null;
    }

   
    public STNode(STNodeType type, Scope scope) {
        this.type = type;
        this.value = null;
        this.scope = scope;
    }

    public STNode(STNodeType type, T value, Scope scope) {
        this.type = type;
        this.value = value;
        this.scope = scope;
    }

    public STNode(STNode node) {
        this.type = node.type;
        this.value = (T) node.value;
        this.scope = node.scope;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public STNodeType getType() {
        return type;
    }

    public void setType(STNodeType type) {
        this.type = type;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
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
