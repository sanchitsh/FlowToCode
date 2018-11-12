package linkednode;

import java.io.PrintWriter;

public class Tester {
	int outputbcounter;
//LEFT==0, Right==1
	public static void main(String[] args) {
		linkedtrees tree=new linkedtrees();
		Outputblock output=new Outputblock("first op");
		ConditionalBlock firstifelse = new ConditionalBlock("second op");
		ConditionalBlock secondifelse=new ConditionalBlock("third op");
		Outputblock secondoutput=new Outputblock("das");
		Outputblock thirdoutput=new Outputblock("sda");
		
		tree.Insert(output, 1);
		tree.Insert(firstifelse, 1);
		tree.InsertAfter(output, secondoutput, 0);
		tree.write(output);
		
		
		
		/*
		tree.inserthead("head");
		tree.InsertAfter(tree.head, "prompt", 1);
		tree.InsertAfter(tree.head.right, "if/else", 1);
		tree.InsertAfter(tree.head.right.right, "true print", 0);
		tree.InsertAfter(tree.head.right.right, "false print", 1);
		tree.InsertAfter(tree.head.right.right.right, "if/else two", 1);
		tree.InsertAfter(tree.head.right.right.right.right, "true", 0);
		tree.InsertAfter(tree.head.right.right.right.right, "false", 1);
		tree.InsertAfter(tree.head.right.right.right.right.left, ender, 1);
		tree.InsertAfter(tree.head.right.right.right.right.right, ender, 1);	
		tree.InsertAfter(ender, "ds", 0);
		tree.write(tree.head);*/

	}
	

}
