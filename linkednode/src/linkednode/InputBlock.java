package linkednode;

import java.io.PrintWriter;

public class InputBlock extends Node {
    InputBlock(String dat) {
        super(dat);
        // TODO Auto-generated constructor stub
    }


    //TODO
    public void converttocode(PrintWriter loc)
    {
        loc.write(info);
    }

}
