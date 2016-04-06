package LexParse;

import java.util.Scanner;
import java.util.Stack;

import LexParse.EecParshBaseListener;
import LexParse.EecParshParser;

// Generated from EecParsh.g4 by ANTLR 4.5.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import Driver.Scope;

/**
 * This class provides an empty implementation of {@link EecParshListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class EecParshBaseListener implements EecParshListener {
	
	private Stack<Scope> scopes;
	private Scanner sc;

    public EecParshBaseListener() {
        scopes = new Stack<Scope>();
        scopes.push(new Scope(null));
        sc = new Scanner(System.in);
    }
    
    //check if type
    //CHANGE TO REGEX
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

    //check if in scope
    private boolean checkVarName(String varName) {
        Scope scope = scopes.peek();
        if(scope.inScope(varName)) {
            return true;
        }
        else {
            return false;
        }
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStaato(EecParshParser.StaatoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStaato(EecParshParser.StaatoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrintF(EecParshParser.PrintFContext ctx) { 
		Scope scope = scopes.peek();
		if(checkVarName(ctx.getChild(2).getText())){
			System.out.println(scope.getValue(ctx.getChild(2).getText()));
		}
		else if (!ctx.getChild(2).getText().matches(".*\\d+.*")){
			String dummy = ctx.getChild(2).getText();
			String temp = dummy.substring(1, dummy.length()-1);
			System.out.println(temp);
		}
		else{
			System.out.println(ctx.getChild(2).getText());
		}
		//.getValue()
	}
		
	@Override public void exitPrintF(EecParshParser.PrintFContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterScanF(EecParshParser.ScanFContext ctx) { 
		Scope scope = scopes.peek();
		//System.out.println(ctx.getChild(2).getText());
		String temp = sc.nextLine();
		scope.resolve(ctx.getChild(2).getText()).setValue(temp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitScanF(EecParshParser.ScanFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc(EecParshParser.FuncContext ctx) { 
		scopes.push(new Scope(scopes.peek()));
		System.out.println(ctx.getChild(4).getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc(EecParshParser.FuncContext ctx) { 
		scopes.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMorefparam(EecParshParser.MorefparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMorefparam(EecParshParser.MorefparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFparam(EecParshParser.FparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFparam(EecParshParser.FparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCodeblock(EecParshParser.CodeblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCodeblock(EecParshParser.CodeblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDatatype(EecParshParser.DatatypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDatatype(EecParshParser.DatatypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign(EecParshParser.AssignContext ctx) { 
		//System.out.println(ctx.getText());
				Scope scope = scopes.peek();
				
				
				if(this.checkVarName(ctx.getChild(2).getText()))
					scope.resolve(ctx.getChild(0).getText()).setValue(scope.getValue(ctx.getChild(2).getText()));
				else if(!this.checkVarType(ctx.getChild(2).getText(), scope.getType(ctx.getChild(0).getText())))
		    		System.out.println("ER: Type mismatch");
				else
					scope.resolve(ctx.getChild(0).getText()).setValue(ctx.getChild(2).getText());
		    	//if(ctx.children.get(1).getChild(2).getChildCount() > 1)
		    		//System.out.println("Expression found");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(EecParshParser.AssignContext ctx) { 
		/*Scope scope = scopes.peek();
		System.out.println(ctx.getChild(0).getText() + ":" + ctx.getChild(2).getText() + ":" + scope.getType(ctx.getChild(0).getText()));
		if(!this.checkVarType(ctx.getChild(2).getText(), scope.getType(ctx.getChild(0).getText())))
				System.out.println("ER: Type mismatch");
		else {
				scope.setValue(ctx.getChild(0).getText(),ctx.getChild(2).getText());
		}*/

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDec(EecParshParser.DecContext ctx) { 
		//System.out.println("Declare:" );
				String varName = ctx.getText();
		        Scope scope = scopes.peek();
		                
		        //check for dupes
		       if (this.checkVarName(ctx.children.get(1).getChild(0).getText()))
		        	System.out.println("ER: Dupe found");
		       else
		        	scope.define(ctx.children.get(1).getChild(0).getText(), ctx.children.get(0).getText(), null);
		            //System.out.println(this.checkVarType(ctx.children.get(1).getChild(2).getText(), ctx.children.get(0).getText()));
		        
         
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDec(EecParshParser.DecContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLit(EecParshParser.LitContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLit(EecParshParser.LitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool(EecParshParser.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool(EecParshParser.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(EecParshParser.ExprContext ctx) {}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(EecParshParser.ExprContext ctx) {
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNexpr(EecParshParser.NexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNexpr(EecParshParser.NexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLexpr(EecParshParser.LexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLexpr(EecParshParser.LexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOlexpr(EecParshParser.OlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOlexpr(EecParshParser.OlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNlexpr(EecParshParser.NlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNlexpr(EecParshParser.NlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMlexpr(EecParshParser.MlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMlexpr(EecParshParser.MlexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLop(EecParshParser.LopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLop(EecParshParser.LopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondif(EecParshParser.CondifContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondif(EecParshParser.CondifContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondelse(EecParshParser.CondelseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondelse(EecParshParser.CondelseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForloop(EecParshParser.ForloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForloop(EecParshParser.ForloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileloop(EecParshParser.WhileloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileloop(EecParshParser.WhileloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondswitch(EecParshParser.CondswitchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondswitch(EecParshParser.CondswitchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondcase(EecParshParser.CondcaseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondcase(EecParshParser.CondcaseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchbreak(EecParshParser.SwitchbreakContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchbreak(EecParshParser.SwitchbreakContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuncall(EecParshParser.FuncallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuncall(EecParshParser.FuncallContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMoreparam(EecParshParser.MoreparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMoreparam(EecParshParser.MoreparamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParam(EecParshParser.ParamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParam(EecParshParser.ParamContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { 
		node.getText();
	}
}