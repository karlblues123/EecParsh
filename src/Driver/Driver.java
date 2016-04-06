package Driver;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;

import LexParse.EecParshBaseListener;
import LexParse.EecParshLexer;
import LexParse.EecParshParser;

public class Driver {
	public static void main(String[] args) throws Exception{
		SourceCodeReader scr = new SourceCodeReader();
		ANTLRInputStream in = new ANTLRInputStream(scr.read("sample2.txt"));
		EecParshLexer lexer = new EecParshLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		EecParshParser parser = new EecParshParser(tokens);
		parser.removeErrorListeners();
		ErrorHandler eh = new ErrorHandler();
		parser.addErrorListener(eh);
		lexer.addErrorListener(eh);
		
		ParseTree t = parser.staato();
		ParseTreeWalker.DEFAULT.walk(new EecParshBaseListener(), t);
		ASTViewer v = new ASTViewer(parser,t);
		v.setVisible(true);
		
	}
}
