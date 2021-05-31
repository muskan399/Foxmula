package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {
	
	static boolean find_ele(ArrayList<Integer> a,int ele)
	{
		return a.contains(ele);
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
		System.out.println("Enter the element you want to search: ");
		ele=sc.nextInt();
		System.out.println(find_ele(arr,ele));
		sc.close();
	}

}
