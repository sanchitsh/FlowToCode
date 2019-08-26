package linkednode;

import java.io.PrintWriter;

public class EndNode extends Node {
    EndNode(String dat) {
        super(dat);
    }
    EndNode() {
        // TODO Auto-generated constructor stub
    }


    public void converttocode(PrintWriter loc)
    {

        loc.write("}");
        loc.println();
        loc.write("}");
        loc.close();
    }
}
