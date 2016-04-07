package Objects;

import java.util.ArrayList;
import java.util.Stack;

public class LinePointer {
	Stack<FunctionTree> tree;
	ArrayList<String> codeByLine;
	public int currLine;
	
	public LinePointer(ArrayList<String> codeByLine){
		for(int i=0; i<codeByLine.size(); i++){
			if(codeByLine.get(i).contains("main")){
				this.currLine = i+1;
			}
		}
	}
}
