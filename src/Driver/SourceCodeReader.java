package Driver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SourceCodeReader {
	BufferedReader br;
	String sourceCode;
	ArrayList<String> codeByLine;
	
	public ArrayList<String> getCodeByLine(){
		return this.codeByLine;
	}
	
	public SourceCodeReader(){
		this.codeByLine = new ArrayList();
	}
	
	public String read(String filename){
		sourceCode = "";
		try {
			br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

			    while (line != null) {
			    	codeByLine.add(line);
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
		    sourceCode = sb.toString();
		    br.close();
		} catch (FileNotFoundException  e) {
			System.out.println("File not found.");
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		return sourceCode;
	}
}
