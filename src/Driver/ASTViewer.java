package Driver;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.Tree;

import LexParse.EecParshParser;

public class ASTViewer extends JFrame{
	
	public ASTViewer(EecParshParser parser, Tree tree){
		//show AST in GUI
		this.setTitle("AST Viewer");
	    JPanel panel = new JPanel();
	    TreeViewer viewr = new TreeViewer(Arrays.asList(
	            parser.getRuleNames()), tree);
	    viewr.setScale(1.0);//scale a little
	    panel.add(viewr);
	    this.add(panel);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(200,200);
	    this.setVisible(true);
	    //End of code for AST in GUI
	}
    
}
