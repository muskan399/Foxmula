package Assignment1;

abstract class Quadrilateral {
	
	protected int x[]=new int[4];
	protected int y[]=new int[4];
	Quadrilateral(int x[],int y[])
	{
		this.x=x;
		this.y=y;
		
	}

	abstract float area();
}
