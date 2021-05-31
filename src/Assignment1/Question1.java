package Assignment1;

public class Question1 {
	
	public static void main(String args[])
	{
		Time t1=new Time();
		t1.setHour(10);
		t1.setMin(6);
		t1.setSec(30);
		Time t2=new Time();
		t2.setHour(10);
		t2.setMin(3);
		t2.setSec(31);
		t2.add(t1);
		
	}


}
