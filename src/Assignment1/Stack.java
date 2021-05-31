package Assignment1;
import java.util.Scanner;

class Node
{
	int data;
	Node link;
}
public class Stack {
	private Node head;
	private int num;
	public int getNum()
	{
		return num;
	}
	Stack()
	{
		head=null;
		num=0;
	}
	boolean checkEmpty()
	{
		if(head==null)
			return false;
		else
			return true;
	}
	void push(int ele)
	{
		Node newNode=new Node();
		newNode.data=ele;
		newNode.link=this.head;
		this.head=newNode;
		num++;
	}
	void pop()
	{
		if(checkEmpty())
		{
			this.head=this.head.link;
			num--;
		}
		else
		{
			return;
		}
		
	}
	
}
