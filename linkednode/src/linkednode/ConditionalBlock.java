package linkednode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ConditionalBlock extends Node {
	
	ConditionalBlock(String dat) {
		super(dat);
		// TODO Auto-generated constructor stub
	}

	public void converttocode(PrintWriter outloc,String condition) throws FileNotFoundException{
	
		outloc.write("\n"+"if("+condition+")");
	}

}
