package Driver;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import LexParse.EecParshBaseVisitor;
import LexParse.EecParshParser;
import LexParse.Type;

public class EecParshVisitor extends EecParshBaseVisitor<Type> {

	private Stack<Scope> scopes;
	
	public EecParshVisitor() {
        scopes = new Stack<Scope>();
        scopes.push(new Scope(null));
    }
	
	private boolean checkVarName(String varName) {
        Scope scope = scopes.peek();
        if(scope.inScope(varName)) {
            return true;
        }
        else {
            return false;
        }
    }
	
	public boolean checkVarType(Type value, String type){
    	if(type.equals("gnstri") && value.isString())
    		return true;
    	else if(type.equals("cahr") && value.isCharacter())
    		return true;
    	else if(type.equals("folat") && value.isFloat())
    		return true;
    	else if(type.equals("loobean") && value.isBoolean())
    		return true;
    	else if(type.equals("nit") && value.isInteger())
    		return true;
    	return false;
    }
	
	@Override 
	public Type visitStaato(EecParshParser.StaatoContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitPrintF(EecParshParser.PrintFContext ctx) { 
		Scope scope = scopes.peek();
		if(this.checkVarName(ctx.lit().getText())) {
			System.out.println(scope.getValue(ctx.lit().getText()));
		}
		else {
			System.out.println(ctx.lit().getText());
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitScanF(EecParshParser.ScanFContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Type visitFunc(EecParshParser.FuncContext ctx) { 
		
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitMorefparam(EecParshParser.MorefparamContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Type visitFparam(EecParshParser.FparamContext ctx) { return visitChildren(ctx); }
	
	@Override public Type visitCodeblock(EecParshParser.CodeblockContext ctx) { return visitChildren(ctx); }
	
	@Override public Type visitDatatype(EecParshParser.DatatypeContext ctx) { return visitChildren(ctx); }
	
	@Override 
	public Type visitAssign(EecParshParser.AssignContext ctx) { 
		Scope scope = scopes.peek();
		Type value = this.visit(ctx.getChild(2));
		if(this.checkVarName(ctx.getChild(2).getText()))
			scope.resolve(ctx.getChild(0).getText()).setValue(value);
		else if(!this.checkVarType(value, scope.getType(ctx.getChild(0).getText())))
    		System.out.println("ER: Type mismatch");
		else
			scope.resolve(ctx.getChild(0).getText()).setValue(value);
		return null; 
	}
	
	@Override 
	public Type visitDec(EecParshParser.DecContext ctx) { 
		String varName;
		if(ctx.assign() != null) {
			varName = ctx.assign().IDEN().getText();
		}
		else {
			varName = ctx.getChild(1).getText();
		}
		String type = ctx.getChild(0).getText();
        Scope scope = scopes.peek();
                
        //check for dupes
       if (this.checkVarName(varName))
        	System.out.println("ER: Dupe found");
       else
        	scope.define(varName,type, null);
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitLit(EecParshParser.LitContext ctx) { 
		Scope currScope = scopes.peek();
		if(ctx.getText().startsWith("\"") && ctx.getText().endsWith("\""))
			return new Type(new String(ctx.getText().substring(1, ctx.getText().length()-1)));
		if(ctx.getText().startsWith("'") && ctx.getText().endsWith("'"))
			return new Type(new Character(ctx.getText().toCharArray()[1]));
		if(ctx.getText().contains("."))
			return new Type(new Float(ctx.getText()));
		if(ctx.getText().matches("-?[0-9]+"))
			return new Type(new Integer(ctx.getText()));
		if(currScope.inScope(ctx.getText())) {
			return currScope.getValue(ctx.getText());
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitBool(EecParshParser.BoolContext ctx) { 
		if(ctx.getText().equals("rute"))
			return new Type(new Boolean("True"));
		if(ctx.getText().equals("lafse"))
			return new Type(new Boolean("False"));
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitExpr(EecParshParser.ExprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			Type left = this.visit(ctx.getChild(0));
			Type right = this.visit(ctx.getChild(2));
			 
			if(ctx.getChild(1).getText().equals("+")) {
				if(left.isFloat() || right.isFloat()) {
					return new Type(left.asFloat() + right.asFloat());
				}
				else if(left.isInteger() && right.isInteger()) {
					return new Type(left.asInteger() + right.asInteger());
				}
				else if(left.isString() || right.isString()) {
					return new Type(left.asString() + right.asString());
				}
			}
			else if(ctx.getChild(1).getText().equals("-")) {
				if(left.isFloat() || right.isFloat()) {
					return new Type(left.asFloat() - right.asFloat());
				}
				else if(left.isInteger() && right.isInteger()) {
					return new Type(left.asInteger() - right.asInteger());
				}
			}
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitNexpr(EecParshParser.NexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(!ctx.getChild(0).getText().equals(")") && !ctx.getChild(2).getText().equals("(")) {
				Type left = this.visit(ctx.getChild(0));
				Type right = this.visit(ctx.getChild(2));
				if(ctx.getChild(1).getText().equals("*")) {
					if(left.isFloat() || right.isFloat()) {
						return new Type(left.asFloat() * right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Type(left.asInteger() * right.asInteger());
					}
				}
				else if(ctx.getChild(1).getText().equals("/")) {
					if(left.isFloat() || right.isFloat()) {
						return new Type(left.asFloat() / right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Type(left.asInteger() / right.asInteger());
					}
				}
				else if(ctx.getChild(1).getText().equals("%")) {
					if(left.isFloat() || right.isFloat()) {
						return new Type(left.asFloat() % right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Type(left.asInteger() % right.asInteger());
					}
				}
			}
			else {
				return this.visit(ctx.getChild(1));
			}	
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitLexpr(EecParshParser.LexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(!ctx.getChild(0).getText().equals(")") && !ctx.getChild(2).getText().equals("(")) {
				Type left = this.visit(ctx.getChild(0));
				Type right = this.visit(ctx.getChild(2));
				return new Type(left.asBoolean() || right.asBoolean());
			}
			else
				return this.visit(ctx.getChild(1));
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitOlexpr(EecParshParser.OlexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(!ctx.getChild(0).getText().equals(")") && !ctx.getChild(2).getText().equals("(")) {
				Type left = this.visit(ctx.getChild(0));
				Type right = this.visit(ctx.getChild(2));
				return new Type(left.asBoolean() && right.asBoolean());
			}
			else
				return this.visit(ctx.getChild(1));
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitNlexpr(EecParshParser.NlexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(ctx.getChildCount() == 4)
				return this.visit(ctx.getChild(2));
			else
				return this.visit(ctx.getChild(1));
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitMlexpr(EecParshParser.MlexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(!ctx.getChild(0).getText().equals(")") && !ctx.getChild(2).getText().equals("(")) {
				Type left = this.visit(ctx.getChild(0));
				Type right = this.visit(ctx.getChild(2));
				Type lop = this.visit(ctx.getChild(1));
				if(left.isFloat() || right.isFloat()) {
					switch(lop.asString()) {
						case "==": return new Type(left.asFloat().floatValue() == right.asFloat().floatValue());
						case ">=": return new Type(left.asFloat().floatValue() >= right.asFloat().floatValue());
						case "<=": return new Type(left.asFloat().floatValue() <= right.asFloat().floatValue());
						case ">": return new Type(left.asFloat().floatValue() > right.asFloat().floatValue());
						case "<": return new Type(left.asFloat().floatValue() < right.asFloat().floatValue());
						case "<>": return new Type(left.asFloat().floatValue() != right.asFloat().floatValue());
					}
				}
				else if(left.isInteger() && right.isInteger()) {
					switch(lop.asString()) {
						case "==": return new Type(left.asInteger().intValue() == right.asInteger().intValue());
						case ">=": return new Type(left.asInteger().intValue() >= right.asInteger().intValue());
						case "<=": return new Type(left.asInteger().intValue() <= right.asInteger().intValue());
						case ">": return new Type(left.asInteger().intValue() > right.asInteger().intValue());
						case "<": return new Type(left.asInteger().intValue() < right.asInteger().intValue());
						case "<>": return new Type(left.asInteger().intValue() != right.asInteger().intValue());
					}
				}
				else if(left.isCharacter() && right.isCharacter()) {
					switch(lop.asString()) {
						case "==": return new Type(left.asCharacter().charValue() == right.asCharacter().charValue());
						case ">=": return new Type(left.asCharacter().charValue() >= right.asCharacter().charValue());
						case "<=": return new Type(left.asCharacter().charValue() <= right.asCharacter().charValue());
						case ">": return new Type(left.asCharacter().charValue() > right.asCharacter().charValue());
						case "<": return new Type(left.asCharacter().charValue() < right.asCharacter().charValue());
						case "<>": return new Type(left.asCharacter().charValue() != right.asCharacter().charValue());
					}
				}
			}
			else
				return this.visit(ctx.getChild(1));
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitLop(EecParshParser.LopContext ctx) { 
		return new Type(ctx.getText()); 
	}
	
	@Override 
	public Type visitCondif(EecParshParser.CondifContext ctx) { 
		Type cond = this.visit(ctx.lexpr());
		if(cond.asBoolean()) {
			return this.visit(ctx.codeblock());
		}
		else if(ctx.condelse() != null) {
			return this.visit(ctx.condelse());
		}
		return null; 
	}
	
	@Override 
	public Type visitCondelse(EecParshParser.CondelseContext ctx) { 
		if(ctx.condif() != null) {
			return this.visit(ctx.condif());
		}
		return this.visit(ctx.codeblock());
	}
	
	@Override 
	public Type visitForloop(EecParshParser.ForloopContext ctx) { 
		this.visit(ctx.dec());
		Type cond = this.visit(ctx.lexpr());
		while(cond.asBoolean().booleanValue()) {
			this.visit(ctx.codeblock());
			this.visit(ctx.assign(0));
			cond = this.visit(ctx.lexpr());
		}
		return null; 
	}
	
	@Override 
	public Type visitWhileloop(EecParshParser.WhileloopContext ctx) { 
		Type cond = this.visit(ctx.lexpr());
		while(cond.asBoolean().booleanValue()) {
			this.visit(ctx.codeblock());
			cond = this.visit(ctx.lexpr());
		}
		return null; 
	}
	
	@Override 
	public Type visitCondswitch(EecParshParser.CondswitchContext ctx) { 
		return this.visit(ctx.condcase()); 
	}
	
	@Override 
	public Type visitCondcase(EecParshParser.CondcaseContext ctx) { 
		Scope scope = scopes.peek();
		if(ctx.condcase() != null) {
			System.out.println("Younger case");
			Type temp = this.visit(ctx.condcase());
			if(temp == null) {
				if(ctx.getChild(2).getText().matches("-?[0-9]+")) {
					Type comparison = new Type(new Integer(Integer.parseInt(ctx.getChild(2).getText())));
					ParserRuleContext parent = ctx.getParent();
					while(!(parent instanceof EecParshParser.CondswitchContext)) {
						System.out.println("Getting parent");
						parent = parent.getParent();
					}
					if(scope.getValue(parent.getChild(2).getText()).isInteger()) {
						Type var = new Type(new Integer(scope.getValue(parent.getChild(2).getText()).asInteger()));
						if(comparison.asInteger().intValue() == var.asInteger().intValue()) {
							this.visit(ctx.codeblock());
							if(ctx.switchbreak().BREAK() != null) {
								System.out.println("Encountered a brake");
								return new Type(new Boolean(true));
							}
							else
								return new Type(new Boolean(false));
						}
					}
					else {
						System.out.println("Error: case and identifier type mismatch");
					}
				}
				else if(ctx.getChild(2).getText().startsWith("'") && ctx.getChild(2).getText().endsWith("'")) {
					Type comparison = new Type(new Character(ctx.getChild(2).getText().charAt(1)));
					ParserRuleContext parent = ctx.getParent();
					while(!(parent instanceof EecParshParser.CondswitchContext)) {
						System.out.println("Getting parent");
						parent = parent.getParent();
					}
					if(scope.getValue(parent.getChild(2).getText()).isCharacter()) {
						Type var = new Type(new Character(scope.getValue(parent.getChild(2).getText()).asCharacter()));
						if(comparison.asCharacter().charValue() == var.asCharacter().charValue()) {
							this.visit(ctx.codeblock());
							if(ctx.switchbreak().BREAK() != null) {
								System.out.println("Encountered a brake");
								return new Type(new Boolean(true));
							}
							else
								return new Type(new Boolean(false));
						}
					}
					else {
						System.out.println("Error: case and identifier type mismatch");
					}
				}
				else {
					System.out.println("Error: case must be of type nit or cahr");
				}
			}
			else if(temp.asBoolean().booleanValue()) {
				return temp;
			}
			else {
				this.visit(ctx.codeblock());
				if(ctx.switchbreak().BREAK() != null) {
					System.out.println("Encountered a brake");
					return new Type(new Boolean(true));
				}
				else
					return temp;
			}
		}
		else {
			System.out.println("Eldest case");
			if(ctx.getChild(1).getText().matches("-?[0-9]+")) {
				Type comparison = new Type(new Integer(Integer.parseInt(ctx.getChild(1).getText())));
				ParserRuleContext parent = ctx.getParent();
				while(!(parent instanceof EecParshParser.CondswitchContext)) {
					System.out.println("Getting parent");
					parent = parent.getParent();
				}
				if(scope.getValue(parent.getChild(2).getText()).isInteger()) {
					Type var = new Type(new Integer(scope.getValue(parent.getChild(2).getText()).asInteger()));
					if(comparison.asInteger().intValue() == var.asInteger().intValue()) {
						this.visit(ctx.codeblock());
						if(ctx.switchbreak().BREAK() != null) {
							System.out.println("Encountered a brake");
							return new Type(new Boolean(true));
						}
						else
							return new Type(new Boolean(false));
					}
				}
				else {
					System.out.println("Error: case and identifier type mismatch");
				}
			}
			else if(ctx.getChild(1).getText().startsWith("'") && ctx.getChild(1).getText().endsWith("'")) {
				Type comparison = new Type(new Character(ctx.getChild(1).getText().charAt(1)));
				ParserRuleContext parent = ctx.getParent();
				while(!(parent instanceof EecParshParser.CondswitchContext)) {
					System.out.println("Getting parent");
					parent = parent.getParent();
				}
				if(scope.getValue(parent.getChild(2).getText()).isCharacter()) {
					Type var = new Type(new Character(scope.getValue(parent.getChild(2).getText()).asCharacter()));
					if(comparison.asCharacter().charValue() == var.asCharacter().charValue()) {
						this.visit(ctx.codeblock());
						if(ctx.switchbreak().BREAK() != null) {
							System.out.println("Encountered a brake");
							return new Type(new Boolean(true));
						}
						else
							return new Type(new Boolean(false));
					}
				}
				else {
					System.out.println("Error: case and identifier type mismatch");
				}
			}
			else {
				System.out.println("Error: case must be of type nit or cahr");
			}
		}
		return null; 
	}
	
	@Override 
	public Type visitSwitchbreak(EecParshParser.SwitchbreakContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Type visitFuncall(EecParshParser.FuncallContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Type visitMoreparam(EecParshParser.MoreparamContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Type visitParam(EecParshParser.ParamContext ctx) { 
		return visitChildren(ctx); 
	}
}
