package Assignment1;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		System.out.println("Enter 4 pairs of x,y co-ordintes for the quardilateral (in the format x y)\n");
		int x[]=new int[4];
		int y[]=new int[4];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			x[i]=obj.nextInt();
			y[i]=obj.nextInt();
		}
		System.out.println("Enter the height for parallelogram and trapezoid\n");
		int height=obj.nextInt();
		Square sq=new Square(x,y);
		Rectangle rect=new Rectangle(x,y);
		Parallelogram para=new Parallelogram(x,y,height);
		Trapezoid trap=new Trapezoid(x,y,height);
		System.out.println("Area of squaare is "+sq.area());
		System.out.println("Area of rectangle is "+rect.area());
		System.out.println("Area of parallelogram is "+para.area());
		System.out.println("Area of trapezoid is "+trap.area());

	}

}
