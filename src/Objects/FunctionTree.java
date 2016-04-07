package Objects;

import org.antlr.v4.runtime.tree.ParseTree;

public class FunctionTree {
	private ParseTree tree;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String functionName) {
		this.name = functionName;
	}
	public ParseTree getTree() {
		return tree;
	}
	public void setTree(ParseTree tree) {
		this.tree = tree;
	}
	public FunctionTree(String name, ParseTree t){
		this.tree = t;
		this.name = name;
		
	}
}
