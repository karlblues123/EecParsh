package Driver;

import java.util.Stack;

import LexParse.EecParshBaseVisitor;
import LexParse.EecParshParser;
import LexParse.Value;

public class EecParshVisitor extends EecParshBaseVisitor<Value> {

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
	
	public boolean checkVarType(Value value, String type){
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
	public Value visitStaato(EecParshParser.StaatoContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitPrintF(EecParshParser.PrintFContext ctx) { 
		
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitScanF(EecParshParser.ScanFContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitFunc(EecParshParser.FuncContext ctx) { return visitChildren(ctx); }
	
	@Override 
	public Value visitMorefparam(EecParshParser.MorefparamContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitFparam(EecParshParser.FparamContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitCodeblock(EecParshParser.CodeblockContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitDatatype(EecParshParser.DatatypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitAssign(EecParshParser.AssignContext ctx) { 
		Scope scope = scopes.peek();
		Value value = this.visit(ctx.getChild(2));
		System.out.println(value);
		if(this.checkVarName(ctx.getChild(2).getText()))
			scope.resolve(ctx.getChild(0).getText()).setValue(value);
		else if(!this.checkVarType(value, scope.getType(ctx.getChild(0).getText())))
    		System.out.println("ER: Type mismatch");
		else
			scope.resolve(ctx.getChild(0).getText()).setValue(value);
		return visitChildren(ctx); 
	}
	
	
	@Override public Value visitDec(EecParshParser.DecContext ctx) { 
		String varName = ctx.getText();
        Scope scope = scopes.peek();
                
        //check for dupes
       if (this.checkVarName(ctx.children.get(1).getChild(0).getText()))
        	System.out.println("ER: Dupe found");
       else
        	scope.define(ctx.children.get(1).getChild(0).getText(), ctx.children.get(0).getText(), null);
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitLit(EecParshParser.LitContext ctx) { 
		Scope currScope = scopes.peek();
		if(ctx.getText().startsWith("\"") && ctx.getText().endsWith("\""))
			return new Value(new String(ctx.getText().substring(1, ctx.getText().length()-1)));
		if(ctx.getText().startsWith("'") && ctx.getText().endsWith("'"))
			return new Value(new Character(ctx.getText().toCharArray()[1]));
		if(ctx.getText().contains("."))
			return new Value(new Float(ctx.getText()));
		if(ctx.getText().matches("-?[0-9]+"))
			return new Value(new Integer(ctx.getText()));
		if(currScope.inScope(ctx.getText())) {
			return currScope.getValue(ctx.getText());
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitBool(EecParshParser.BoolContext ctx) { 
		if(ctx.getText().equals("rute"))
			return new Value(new Boolean("True"));
		if(ctx.getText().equals("lafse"))
			return new Value(new Boolean("False"));
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitExpr(EecParshParser.ExprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			Value left = this.visit(ctx.getChild(0));
			Value right = this.visit(ctx.getChild(2));
			 
			if(ctx.getChild(1).getText().equals("+")) {
				if(left.isFloat() || right.isFloat()) {
					return new Value(left.asFloat() + right.asFloat());
				}
				else if(left.isInteger() && right.isInteger()) {
					return new Value(left.asInteger() + right.asInteger());
				}
				else if(left.isString() || right.isString()) {
					return new Value(left.asString() + right.asString());
				}
			}
			else if(ctx.getChild(1).getText().equals("-")) {
				if(left.isFloat() || right.isFloat()) {
					return new Value(left.asFloat() - right.asFloat());
				}
				else if(left.isInteger() && right.isInteger()) {
					return new Value(left.asInteger() - right.asInteger());
				}
			}
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitNexpr(EecParshParser.NexprContext ctx) { 
		if(ctx.getChildCount() > 1) {
			if(!ctx.getChild(0).getText().equals(")") && !ctx.getChild(2).getText().equals("(")) {
				Value left = this.visit(ctx.getChild(0));
				Value right = this.visit(ctx.getChild(2));
				if(ctx.getChild(1).getText().equals("*")) {
					if(left.isFloat() || right.isFloat()) {
						return new Value(left.asFloat() * right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Value(left.asInteger() * right.asInteger());
					}
				}
				else if(ctx.getChild(1).getText().equals("/")) {
					if(left.isFloat() || right.isFloat()) {
						return new Value(left.asFloat() / right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Value(left.asInteger() / right.asInteger());
					}
				}
				else if(ctx.getChild(1).getText().equals("%")) {
					if(left.isFloat() || right.isFloat()) {
						return new Value(left.asFloat() % right.asFloat());
					}
					else if(left.isInteger() && right.isInteger()) {
						return new Value(left.asInteger() % right.asInteger());
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
	public Value visitLexpr(EecParshParser.LexprContext ctx) { 
		
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitOlexpr(EecParshParser.OlexprContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitNlexpr(EecParshParser.NlexprContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitMlexpr(EecParshParser.MlexprContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitLop(EecParshParser.LopContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitCondif(EecParshParser.CondifContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitCondelse(EecParshParser.CondelseContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitForloop(EecParshParser.ForloopContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitWhileloop(EecParshParser.WhileloopContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitCondswitch(EecParshParser.CondswitchContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitCondcase(EecParshParser.CondcaseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitSwitchbreak(EecParshParser.SwitchbreakContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFuncall(EecParshParser.FuncallContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitMoreparam(EecParshParser.MoreparamContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitParam(EecParshParser.ParamContext ctx) { return visitChildren(ctx); }
}
