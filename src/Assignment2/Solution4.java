package Assignment2;
import java.util.*;

public class Solution4 {
    public static void main(String args[]){
        TreeSet<Integer> hs=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements you wish to add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            hs.add(sc.nextInt());
        }
        Iterator<Integer>itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        sc.close();
    }
}