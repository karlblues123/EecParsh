package LexParse;

// Generated from EecParsh.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EecParshParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EecParshVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EecParshParser#staato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaato(EecParshParser.StaatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#printF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintF(EecParshParser.PrintFContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#scanF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanF(EecParshParser.ScanFContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(EecParshParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#morefparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorefparam(EecParshParser.MorefparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#fparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFparam(EecParshParser.FparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(EecParshParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(EecParshParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(EecParshParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(EecParshParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(EecParshParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(EecParshParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EecParshParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(EecParshParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(EecParshParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#olexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlexpr(EecParshParser.OlexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#nlexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlexpr(EecParshParser.NlexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#mlexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMlexpr(EecParshParser.MlexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#lop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLop(EecParshParser.LopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#condif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondif(EecParshParser.CondifContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#condelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondelse(EecParshParser.CondelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(EecParshParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(EecParshParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#condswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondswitch(EecParshParser.CondswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#condcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondcase(EecParshParser.CondcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#switchbreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchbreak(EecParshParser.SwitchbreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#funcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall(EecParshParser.FuncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#moreparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreparam(EecParshParser.MoreparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link EecParshParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(EecParshParser.ParamContext ctx);
}