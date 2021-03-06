package linkednode;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	int outputbcounter;
	linkedtrees l=new linkedtrees();
	int ender =0;
	Scanner scan=new Scanner(System.in);
	Node currNode;
//LEFT==0, Right==1

	public void insertNode() throws FileNotFoundException {

		ArrayList<Node>spnodes=new ArrayList<Node>();
		File f=new File("CodeForFlow.java");
		System.out.println("Please enter the location you want to store the code at OR press the return key to store files this lib");
		String loca=scan.nextLine();
		if(!loca.equals("")){ f=new File(loca+"CodeForFlow.java");}
		PrintWriter p =new PrintWriter(f);
		l.setPrintWriter(p);
		while(ender==0) {
		spnodes=l.specialNode();
			System.out.println("Listed below will be the blocks that are not connected to other blocks");
			for (int i = 0; i < spnodes.size(); i++)  {System.out.println("Id ("+i+") -> "+ spnodes.get(i).info);}
			System.out.println("Please enter the id of the block you want to add after :  ");
			int id=scan.nextInt();
			Node chosenOne= spnodes.get(id);
			addBlocks(chosenOne);
			System.out.println("Node added!");
		}



	}
	public void addBlocks(Node n){
		System.out.println("1 : Process Block, 2 : I/O Block, 3 : Decision Block, 4 : End Block");
		int choice = scan.nextInt();
		scan.nextLine();
		System.out.println("Press y, if this will be the last block in the conditional statement branch OR press return");
		String c=scan.nextLine();
		switch (choice) {
			case 1: {
				System.out.println("Enter the process you want to execute. Make sure this process is one line of code");
				String process = scan.nextLine();
				if(c.equals("y"))process=process+"	}";
				ProcessBlock x = new ProcessBlock(process);
				System.out.println("If You are adding this Block to a specific branch(left or right), please enter the branch number(0 or 1), otherwise just press the return key");
				String s=scan.nextLine();
				if(s.equals("")) l.InsertAfter(n,x,0);
				else {int a=Integer.parseInt(s);
					l.InsertAfter(n,x,a);
				}

			}
			break;
			case 2: {
				System.out.println("Do you want input or output?(i: input or o:output)");
				char io = scan.nextLine().charAt(0);
				if (io == 'i') {
                    System.out.println();

				} else if (io == 'o') {
					System.out.println("Enter the output you want to display");
					String otpt = scan.nextLine();
					if(c.equals("y"))otpt=otpt+"	}";
					Outputblock o = new Outputblock(otpt);
					//		l.inserthead(o);
					System.out.println("If You are adding this Block to a specific branch(left or right), please enter the branch number(0 or 1), otherwise just press the return key");
					String s=scan.nextLine();
					if(s.equals("")) l.InsertAfter(n,o,0);
					else {int a=Integer.parseInt(s);
						l.InsertAfter(n,o,a);
					}
				}
			}
			break;
			case 3: {
				System.out.println("Enter the condition you want to verify?");
				String conds = scan.nextLine();
				if(c.equals("y"))conds=conds+"	}";
				ConditionalBlock x = new ConditionalBlock(conds);
				System.out.println("If You are adding this Block to a specific branch(left or right), please enter the branch number(0 or 1), otherwise just press the return key");
				String s=scan.nextLine();
				if(s.equals("")) l.InsertAfter(n,x,0);
				else {int a=Integer.parseInt(s);
					l.InsertAfter(n,x,a);
				}
			}
			break;
			case 4: {
				System.out.println("Ending Prog");
				String process="";
				if(c.equals("y"))process=process+"	}";
				EndNode x = new EndNode(process);
					l.InsertAfter(n,x,1);
					l.write();
					ender=1;
			}
			break;
		}
	}
	}

