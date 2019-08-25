package linkednode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StartNode extends Node {
    StartNode(String dat) {
        super(dat);
        // TODO Auto-generated constructor stub
    }
    PrintWriter loc;String process;

    public void writestring(String process){
        this.process=process;
    }
    public void converttocode(PrintWriter location) throws FileNotFoundException {
        this.loc=location;
        loc.write("\n"+"process"+";");
    }
}
