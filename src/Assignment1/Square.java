package Assignment1;

public class Square extends Quadrilateral {
	
	Square(int x[],int y[])
	{
		super(x,y);
	}
	float area() {
		float ans=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		return ans*ans;
	}

}
