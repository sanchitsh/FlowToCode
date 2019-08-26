package linkednode;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String args[]){
        Tester t= new Tester();
        try {
            t.insertNode();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        }
    }


}
