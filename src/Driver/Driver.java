package Driver;


import java.util.Stack;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;

import LexParse.EecParshBaseListener;
import LexParse.EecParshLexer;
import LexParse.EecParshParser;
import Objects.FunctionTree;
import Objects.LinePointer;

public class Driver {
	public static void main(String[] args) throws Exception{
		Stack<FunctionTree> trees = new Stack();
		
		SourceCodeReader scr = new SourceCodeReader();
		ANTLRInputStream in = new ANTLRInputStream(scr.read("sample2.txt"));
		EecParshLexer lexer = new EecParshLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		EecParshParser parser = new EecParshParser(tokens);
		parser.removeErrorListeners();
		ErrorHandler eh = new ErrorHandler();
		parser.addErrorListener(eh);
		lexer.addErrorListener(eh);
		
		LinePointer lp = new LinePointer(scr.codeByLine);
		
		ParseTree t = parser.staato();
		
		/*
		for (int i = 0; i < childCount; i++) {
		ParseTree t = parser.staato();
		//ParseTreeWalker.DEFAULT.walk(new EecParshBaseListener(), t);
		
		/*ParseTree tree = parser.staato(); 
		ParseTree mainNode = null;
		int childCount = tree.getChildCount();
		*/
		/*for (int i = 0; i < childCount; i++) {
			String funcName = tree.getChild(i).getChild(2).toStringTree();
			if (funcName.equals("main")) {
				mainNode = tree.getChild(i);
			}
			trees.push(tree.getChild(i));
		}
		//System.out.println(mainNode.toString());
		System.out.println(lp.currLine);
		ParseTreeWalker.DEFAULT.walk(new EecParshBaseListener(), tree);
		ParseTreeWalker.DEFAULT.walk(new EecParshBaseListener(), tree.getChild(1));*/
		
		ASTViewer v = new ASTViewer(parser,t);
		v.setVisible(true);
		
		EecParshVisitor visitor = new EecParshVisitor();
		visitor.visit(t);
		
		
		
	}
	
}
