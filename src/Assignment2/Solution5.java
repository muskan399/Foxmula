package Assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution5 {
	
	public static void find_occurence(ArrayList<Integer> a)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.size();i++)
		{
			if(hm.containsKey(a.get(i)))
			{
				int count=(Integer)(hm.get(a.get(i)))+1;
				hm.replace(a.get(i),count);
				
			}
			else
				hm.put(a.get(i),1);
				
		}
		for(Map.Entry m : hm.entrySet()){    
		    System.out.println(m.getKey()+" occurs: "+m.getValue()+" times");    
		   }  
		
		
	}
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);  
	System.out.println("Enter the number of elements: ");
	int ele= sc.nextInt();  
	ArrayList<Integer>arr=new ArrayList<Integer>();
	System.out.println("Enter the elements of array");
	for(int i=0;i<ele;i++)
	{
		arr.add(sc.nextInt());
		
	}
	find_occurence(arr);
	sc.close();
	}
}
