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
	
	public boolean checkVarType(String value, String type){
    	if(type.equals("gnstri")){
    		if(value.startsWith("\"") && value.endsWith("\""))
    				return true;
    	}
    	else if(type.equals("cahr")){
    		if(value.startsWith("'") && value.endsWith("'"))
    				return true;
    	}
    	else if(type.equals("folat")){
    		if(value.contains("."))
    				return true;
    	}
    	else if(type.equals("loobean")){
    		if(value.equals("rute") || value.equals("lafse"))
    				return true;
    	}
    	else if(type.equals("nit")){
    		if(value.matches("-?[0-9]+"))
    				return true;
    	}
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitMorefparam(EecParshParser.MorefparamContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitFparam(EecParshParser.FparamContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCodeblock(EecParshParser.CodeblockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitDatatype(EecParshParser.DatatypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitAssign(EecParshParser.AssignContext ctx) { 
		System.out.println("Visiting a Assign");
		
		Scope scope = scopes.peek();
		
		
		if(this.checkVarName(ctx.getChild(2).getText()))
			scope.resolve(ctx.getChild(0).getText()).setValue(scope.getValue(ctx.getChild(2).getText()));
		else if(!this.checkVarType(ctx.getChild(2).getText(), scope.getType(ctx.getChild(0).getText())))
    		System.out.println("ER: Type mismatch");
		else
			scope.resolve(ctx.getChild(0).getText()).setValue(scope.getValue(ctx.getChild(2).getText()));
		return visitChildren(ctx); 
	}
	
	
	@Override public Value visitDec(EecParshParser.DecContext ctx) { 
		System.out.println("Visiting a Dec");
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
		System.out.println(ctx.getToken(arg0, arg1));
		System.out.println(ctx.getChild(0).getText());
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitBool(EecParshParser.BoolContext ctx) { return visitChildren(ctx); }
	
	@Override 
	public Value visitExpr(EecParshParser.ExprContext ctx) { 
			
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitNexpr(EecParshParser.NexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitLexpr(EecParshParser.LexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitOlexpr(EecParshParser.OlexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitNlexpr(EecParshParser.NlexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitMlexpr(EecParshParser.MlexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitLop(EecParshParser.LopContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCondif(EecParshParser.CondifContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Valuehe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCondelse(EecParshParser.CondelseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitForloop(EecParshParser.ForloopContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitWhileloop(EecParshParser.WhileloopContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Value visitCondswitch(EecParshParser.CondswitchContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
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
