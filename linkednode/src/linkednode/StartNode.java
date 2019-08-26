package linkednode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StartNode extends Node {
    StartNode(String dat) {
        super(dat);
        // TODO Auto-generated constructor stub
    }

    public void converttocode(PrintWriter location) {
        location.write("//Import Statements");
        location.println();
        location.write("import java.util.Scanner;");
        location.println();
        location.println();
        location.write("public class CodeForFlow {   //Class Declaration");
        location.println();
        location.println();
        location.write("public static void main(String args[]) { // Main Method Declaration");
        location.println();
    }
}
