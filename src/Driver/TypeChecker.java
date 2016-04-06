package Driver;

public class TypeChecker {
	public TypeChecker(){}
	
	public void reportError(int r, int line, int col){
		switch(r){
		case 1: System.out.println("Line "+ line + ":" + col + ":Type mismatch");
		}
	}
}
