package Driver;

import org.antlr.v4.runtime.tree.ParseTree;

import LexParse.Type;

public class EecParshFunction extends Symbol {

	protected ParseTree parameters;
	protected ParseTree method;
	
	public EecParshFunction(String name, String type, Type value,ParseTree parameters,ParseTree method) {
		super(name, type, value);
		this.parameters = parameters;
		this.method = method;
	}

	public ParseTree getParameters() {
		return parameters;
	}

	public void setParameters(ParseTree parameters) {
		this.parameters = parameters;
	}

	public ParseTree getMethod() {
		return method;
	}

	public void setMethod(ParseTree method) {
		this.method = method;
	}
}
