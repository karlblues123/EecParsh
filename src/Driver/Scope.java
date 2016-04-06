package Driver;

import java.util.Map;

import LexParse.Value;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Scope {

	public final int genID;
	
	public enum ScopeType {
		LOCAL,
		GLOBAL
	}
	
	public ScopeType type;
	public Scope enclosingScope;
	protected Map<String,Symbol> symbolMap = new LinkedHashMap<String,Symbol>();
	
	public Scope(Scope enclosingScope) {
		this.genID=0;
		this.enclosingScope = enclosingScope;
    }
	
	public Scope(ScopeType type, final int genId, Scope enclosingScope) {
        this.type = type;
        this.genID = genId;
        this.enclosingScope = enclosingScope;
    }
	
	/** 
     * Define a new variable in the current scope 
     * This is the entry point for adding new variables
     */
    public void define(String name,String type,Value value) {
        Symbol symbol = new Symbol(name,type,value);
        define(symbol);
    }

    /** Define a symbol in the current scope */
    private void define(Symbol symbol) {
        symbol.setScope(this);
        symbolMap.put(symbol.name, symbol);
    }

    /**
     * Look up the symbol name in this scope and, if not found, 
     * progressively search the enclosing scopes. 
     * Return null if not found in any applicable scope.
     */
    public Symbol resolve(String name) {
        Symbol symbol = symbolMap.get(name);
        if (symbol != null) return symbol;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null; // not found
    }

    /** Where to look next for symbols */
    public Scope enclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        return symbolMap.keySet().toString() + ":" + symbolMap.values().toString();
    }
    
    public String getType(String key){
    	return symbolMap.get(key).type;
    }
    
    public Value getValue(String key){
    	return symbolMap.get(key).value;
    }
    
    public void setValue(String key,Value value) {
    	symbolMap.get(key).setValue(value);
    }
    
    public boolean inScope(String varName){
    	if(symbolMap.containsKey(varName)){
    		return true;
    	}
    	return this.enclosingScope == null ? false : this.enclosingScope.inScope(varName);
    }
    
}