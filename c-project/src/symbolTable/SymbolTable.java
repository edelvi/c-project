package symbolTable;

import java.util.HashMap;

public class SymbolTable<Symbol> {
    private final HashMap<String, Symbol> symbols;

    public SymbolTable() {
        symbols = new HashMap<>();
    }

    public Symbol get(String id) {
        return symbols.get(id);
    }

    public Symbol put(String id, Symbol s) {
        return symbols.put(id, s);
    }
};
