package Driver;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {

	    protected Stack<Scope> scopeStack;
	    protected ArrayList<Scope> allScopes;
	    protected int genId;

	    public SymbolTable() {
	        init();
	    }

	    protected void init() {
	        scopeStack = new Stack<>();
	        allScopes = new ArrayList<>();
	        genId = 0;

	        Scope globals = new Scope(Scope.ScopeType.GLOBAL, nextGenId(), null);
	        scopeStack.push(globals);
	        allScopes.add(globals);
	    }

	    public Scope pushScope() {
	        Scope enclosingScope = scopeStack.peek();
	        Scope scope = new Scope(Scope.ScopeType.LOCAL, nextGenId(), enclosingScope);
	        scopeStack.push(scope);
	        allScopes.add(scope);
	        return scope;
	    }

	    public void popScope() {
	        scopeStack.pop();
	    }

	    public Scope currentScope() {
	        if (scopeStack.size() > 0) {
	            return scopeStack.peek();
	        }
	        System.out.println(this+ ": Unbalanced scope stack.");
	        return allScopes.get(0);
	    }

	    public Scope getScope(int genId) {
	        for (Scope scope : scopeStack) {
	            if (scope.genID == genId) return scope;
	        }
	        return null;
	    }

	    private int nextGenId() {
	        genId++;
	        return genId;
	    }

	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Scope scope : scopeStack.subList(0, scopeStack.size() - 1)) {
	            sb.append(scope.toString());
	        }
	        return sb.toString();
	    }
}
