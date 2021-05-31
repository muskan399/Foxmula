package Assignment1;

public class Trapezoid extends Quadrilateral {
	
	float height;
	Trapezoid(int x[],int y[],float height)
	{
		super(x,y);
		this.height=height;
	}
	float area()
	{
		float b1=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		float b2=(float)Math.sqrt((x[3]-x[2])*(x[3]-x[2])+(y[3]-y[2])*(y[3]-y[2]));
		return 0.5f*(b1+b2)*height;
	}

}
