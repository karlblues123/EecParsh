package LexParse;

// Generated from EecParsh.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EecParshParser}.
 */
public interface EecParshListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EecParshParser#staato}.
	 * @param ctx the parse tree
	 */
	void enterStaato(EecParshParser.StaatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#staato}.
	 * @param ctx the parse tree
	 */
	void exitStaato(EecParshParser.StaatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#printF}.
	 * @param ctx the parse tree
	 */
	void enterPrintF(EecParshParser.PrintFContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#printF}.
	 * @param ctx the parse tree
	 */
	void exitPrintF(EecParshParser.PrintFContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#scanF}.
	 * @param ctx the parse tree
	 */
	void enterScanF(EecParshParser.ScanFContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#scanF}.
	 * @param ctx the parse tree
	 */
	void exitScanF(EecParshParser.ScanFContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(EecParshParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(EecParshParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#morefparam}.
	 * @param ctx the parse tree
	 */
	void enterMorefparam(EecParshParser.MorefparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#morefparam}.
	 * @param ctx the parse tree
	 */
	void exitMorefparam(EecParshParser.MorefparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(EecParshParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(EecParshParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(EecParshParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(EecParshParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(EecParshParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(EecParshParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(EecParshParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(EecParshParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(EecParshParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(EecParshParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(EecParshParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(EecParshParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(EecParshParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(EecParshParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EecParshParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EecParshParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void enterNexpr(EecParshParser.NexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void exitNexpr(EecParshParser.NexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(EecParshParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(EecParshParser.LexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#olexpr}.
	 * @param ctx the parse tree
	 */
	void enterOlexpr(EecParshParser.OlexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#olexpr}.
	 * @param ctx the parse tree
	 */
	void exitOlexpr(EecParshParser.OlexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#nlexpr}.
	 * @param ctx the parse tree
	 */
	void enterNlexpr(EecParshParser.NlexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#nlexpr}.
	 * @param ctx the parse tree
	 */
	void exitNlexpr(EecParshParser.NlexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#mlexpr}.
	 * @param ctx the parse tree
	 */
	void enterMlexpr(EecParshParser.MlexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#mlexpr}.
	 * @param ctx the parse tree
	 */
	void exitMlexpr(EecParshParser.MlexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(EecParshParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(EecParshParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#condif}.
	 * @param ctx the parse tree
	 */
	void enterCondif(EecParshParser.CondifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#condif}.
	 * @param ctx the parse tree
	 */
	void exitCondif(EecParshParser.CondifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#condelse}.
	 * @param ctx the parse tree
	 */
	void enterCondelse(EecParshParser.CondelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#condelse}.
	 * @param ctx the parse tree
	 */
	void exitCondelse(EecParshParser.CondelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(EecParshParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(EecParshParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(EecParshParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(EecParshParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#condswitch}.
	 * @param ctx the parse tree
	 */
	void enterCondswitch(EecParshParser.CondswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#condswitch}.
	 * @param ctx the parse tree
	 */
	void exitCondswitch(EecParshParser.CondswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#condcase}.
	 * @param ctx the parse tree
	 */
	void enterCondcase(EecParshParser.CondcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#condcase}.
	 * @param ctx the parse tree
	 */
	void exitCondcase(EecParshParser.CondcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#switchbreak}.
	 * @param ctx the parse tree
	 */
	void enterSwitchbreak(EecParshParser.SwitchbreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#switchbreak}.
	 * @param ctx the parse tree
	 */
	void exitSwitchbreak(EecParshParser.SwitchbreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(EecParshParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(EecParshParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#moreparam}.
	 * @param ctx the parse tree
	 */
	void enterMoreparam(EecParshParser.MoreparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#moreparam}.
	 * @param ctx the parse tree
	 */
	void exitMoreparam(EecParshParser.MoreparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EecParshParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(EecParshParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EecParshParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(EecParshParser.ParamContext ctx);
}