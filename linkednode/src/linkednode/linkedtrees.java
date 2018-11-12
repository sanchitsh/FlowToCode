package linkednode;

public class linkedtrees {
   Node head;Node curnode;
 public void write(Node node) 
 {
		if(node==null)
		return;
		node.converttocode();
		System.out.print(node.name+"	");
		write(node.left);
		write(node.right);
		
		
	}
public void inserthead(String head_data){
	
	if(head==null){
		head=new Node(head_data);
		curnode=head;
	}
	
}

public void Insert(Node new_node, int leftright){
	 /*1. check if the given prev_node is NULL */
    if (curnode == null) {
        curnode=new_node;
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
	System.out.println("Current Node is +"+curnode.name);
}
}


    
