package symbolTable;

public class Scope<Symbol> {

    private final SymbolTable<STNode> symbolTable;
    private Scope<Symbol> parent;

    public Scope() {
        symbolTable = new SymbolTable<>();
        parent = null;
    }

    public Scope(Scope scope) {
        symbolTable = new SymbolTable<>();
        parent = scope;
    }

    public Scope<Symbol> getScope(String id) {
        Scope<Symbol> scope = this;
        while ((scope.symbolTable.get(id) == null) && (scope.parent != null)) {
            scope = scope.parent;
        }
        return scope;
    }

    public STNode put(String id, STNode n) {
        Scope<Symbol> scope = this;

        return scope.symbolTable.put(id, n);
    }

    public STNode get(String id) {
        Scope<Symbol> scope = getScope(id);
        return scope.symbolTable.get(id);
    }

    public Scope<Symbol> getParent() {
        return parent;
    }
}
