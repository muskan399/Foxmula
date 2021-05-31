package Assignment1;

public class Rectangle extends Quadrilateral {
	
	Rectangle(int x[],int y[])
	{
		super(x,y);
	}
	float area() {
		float a=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		float b=(float)Math.sqrt((x[3]-x[2])*(x[3]-x[2])+(y[3]-y[2])*(y[3]-y[2]));
		return a*b;
	}

}
