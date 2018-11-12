package linkednode;


import java.io.PrintWriter;

public class Outputblock extends Node {
	Outputblock(String dat) {
		super(dat);
		// TODO Auto-generated constructor stub
	}

	PrintWriter location; String output;
	
	
	public void writestring(String output){
		this.output=output;	
	}
	
	public void converttocode(PrintWriter loc)
	{
		this.location=loc;
		location.write("System.out.println("+this.output+");");
	}

}
