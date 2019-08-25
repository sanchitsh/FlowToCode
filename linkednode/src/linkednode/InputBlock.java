package linkednode;

import java.io.PrintWriter;

public class InputBlock extends Node {
    InputBlock(String dat) {
        super(dat);
        // TODO Auto-generated constructor stub
    }

    PrintWriter location; String output;


    public void writestring(String output){
        this.output=output;
    }
    //TODO
    public void converttocode(PrintWriter loc)
    {
        this.location=loc;
        location.write("System.out.println("+this.output+");");
    }

}
