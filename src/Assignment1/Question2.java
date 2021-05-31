package Assignment1;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String args[])
	{
		Stack s1=new Stack();
		Stack  s2=new Stack();
		while(true) 
		{
			System.out.println("Enter your choice..\n");
			System.out.println(" Press 1: To push element in Stack 1 \n Press 2: To push element in Stack 2 \n Press 3: To pop element from Stack 1 \n Press 4: To pop element from Stack2 \n Press 5: Exit");
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    int option = myObj.nextInt();  // Read user input
			switch(option) {
			  case 1:
				Scanner obj = new Scanner(System.in);  // Create a Scanner object
				System.out.println("Enter the element");
				int ele = obj.nextInt();  // Read user input
				s1.push(ele);
			    if(s1.getNum()==s2.getNum())
			    	System.out.println("HOLA!! Size of both stack is same:  "+s1.getNum());
			    break;
			  case 2:
				  Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
				  System.out.println("Enter the element");
				  int ele2 = obj2.nextInt();  // Read user input
				  s2.push(ele2);
				  if(s1.getNum()==s2.getNum())
					  System.out.println("HOLA!! Size of both stack is same:  "+s1.getNum());
				  break;
			  case 3:
				  s1.pop();
				  if(s1.getNum()==s2.getNum())
					  System.out.println("HOLA!! Size of both stack is same:  "+s1.getNum());
				  break;
			  case 4:
				  s2.pop();
				  if(s1.getNum()==s2.getNum())
					  System.out.println("HOLA!! Size of both stack is same:  "+s1.getNum());
				  break;
			  case 5:
				  return;
			  default:
			    System.out.println("Please select a valid option");
			}
		}
	}

}
