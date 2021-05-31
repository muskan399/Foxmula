package Assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Solution3 {
	public static void main(String args[])
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter the number of elements: ");
		int ele= sc.nextInt();  
		System.out.println("Enter the elements of array");
		for(int i=0;i<ele;i++)
			hs.add(sc.nextInt());
		Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        sc.close();
	}

}
