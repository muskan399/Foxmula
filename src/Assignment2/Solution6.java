package Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution6 {
	static ArrayList get_pair(ArrayList<Integer> list,int sum) {
		HashSet<Integer> set=new HashSet<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			int tem=sum-list.get(i);
			if(set.contains(tem)) {
				result.add(list.get(i));
				result.add(tem);
				return result;
			}
			else {
				set.add(list.get(i));
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Size of Array List:");
		int size=Integer.parseInt(scanner.nextLine());
		if(size>0)
			System.out.println("Enter the elements");
		ArrayList list=new ArrayList(size);
		for(int i=0;i<size;i++) {
			int element=scanner.nextInt();
			list.add(element);
		}
		System.out.print("Enter the sum for checking pairs:");
		int sum=scanner.nextInt();
		ArrayList answer=get_pair(list, sum);
		if(answer.isEmpty())
			System.out.println("No pair");
		else
		System.out.print(answer.toString());
		
		scanner.close();
		
	}

}