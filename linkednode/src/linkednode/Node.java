package linkednode;


import java.io.PrintWriter;

public class Node {
	String type="ID Block";
	 String info;
	 Node left;
	 Node right;
	 Node prev;

	 Node(){};
	 Node(String dat){
	 	this.info=dat;
	 }
	 public String getData() {
		return info;
	}
	 public void converttocode(PrintWriter p){
		 
	 }
	 
	 }