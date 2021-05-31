package Assignment1;

public class Time {
	private int hour,min,sec;
	public int getHour()
	{
		return hour;
	}
	public int getMin()
	{
		return min;
	}
	public int getSec()
	{
		return sec;
	}
	public void setHour(int hour)
	{
		this.hour=hour;
	}
	public void setMin(int min)
	{
		this.min=min;
	}
	public void setSec(int sec)
	{
		this.sec=sec;
	}
	public void add(Time t)
	{
		t.sec=t.sec+this.sec;
		if(t.sec>59)
		{
			t.min=t.sec/60+t.min;
			t.sec=t.sec%60;
		}
		t.min=this.min+t.min;
		if(t.min>59)
		{
			t.hour=t.min/60+t.hour;
			t.min=t.min%60+t.min;
		}
		t.hour=this.hour+t.hour;
		if(t.hour>=24)
		{
			t.hour=t.hour%24+t.hour;
		}
		System.out.println("Hours : "+t.hour+"\nMinutes : "+t.min+"\nSeconds : "+t.sec);
		
	}
}
