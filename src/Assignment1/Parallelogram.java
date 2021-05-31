package Assignment1;

public class Parallelogram extends Quadrilateral {
	
	float height;
	Parallelogram(int x[],int y[],float height)
	{
		super(x,y);
		this.height=height;
	}
	float area() {
		float base=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		return base*height;
	}
	

}
