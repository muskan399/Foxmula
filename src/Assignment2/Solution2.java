package Assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {
	
	static boolean check_ele(HashSet<Integer>hs,int ele)
	{
		return hs.contains(ele);
	}
	public static void main(String args[])
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter the number of elements: ");
		int ele= sc.nextInt();  
		System.out.println("Enter the elements of array");
		for(int i=0;i<ele;i++)
		{
			hs.add(sc.nextInt());
			
		}
		System.out.println("Enter the element you want to search: ");
		ele=sc.nextInt();
		System.out.println(check_ele(hs,ele));
		sc.close();
	}
	

}
