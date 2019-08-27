package linkednode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ProcessBlock extends Node{
	ProcessBlock(String dat) {
		super(dat);
		// TODO Auto-generated constructor stub
	}

	public void converttocode(PrintWriter location){

		location.write(info);
		location.println();
	}

}
