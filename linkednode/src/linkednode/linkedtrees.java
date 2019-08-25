package linkednode;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedtrees {
    linkedtrees(){
        StartNode s=new StartNode("Start");
        this.head=s;
    }
   Node head;Node curnode;
   ArrayList<Node> x;
 private void writeSP(Node node)
 {
		if(node==null)
		return;
		node.converttocode();
		System.out.print(node.info+"	");
		writeSP(node.left);
		writeSP(node.right);

 }
  public void write(){
     writeSP(this.head);
  }

private void specialNodeCheck(Node node){
    if(node==null) {
        return;
    }
    if(node.type.equals("NA")) {
        if (node.left == null || node.right == null) {
            x.add(node);
        }
    }
    else{if (node.left == null) x.add(node); }
    specialNodeCheck(node.left);
    specialNodeCheck(node.right);
}
public ArrayList<Node> specialNode(){
    x=new ArrayList<Node>();
    specialNodeCheck(head);
    return x;
}



public void Insert(Node new_node, int leftright){
	 /*1. check if the given prev_node is NULL */
    if (curnode == null) {
       Insert(new_node,0);
    }
    if(leftright==0){
    	curnode.left=new_node;
    }
    if(leftright==1){
    	curnode.right=new_node;
    }
    curnode=new_node;
	
}
public void InsertAfter(Node prev_Node, Node new_node, int leftright){
   if (prev_Node == null) {
       System.out.println("The given previous node cannot be NULL ");
       return;
   }

   if(leftright==0){
   	prev_Node.left=new_node;
   }
   if(leftright==1){
   	prev_Node.right=new_node;
   }
   curnode=new_node;
	System.out.println("Current Node is +"+curnode.info);
}
}


    
