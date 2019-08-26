package linkednode;


import java.io.PrintWriter;

public class Outputblock extends Node {
	Outputblock(String dat) {
		super(dat);
		// TODO Auto-generated constructor stub
	}

	

	
	public void converttocode(PrintWriter loc)
	{
		loc.write("System.out.println("+info+");");
		loc.println();
	}

}
