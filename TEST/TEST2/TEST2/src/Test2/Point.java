package Test2;
public class Point 
{
	double x;
	double y;
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Integer values: "+ (int)this.x + " " + (int)this.y);
	}
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Double values: "+ this.x + " " + this.y);
	}
	public static void main(String[] args) 
	{
		Point pt, pt1;
		pt  = new Point(3,4);
		pt1 = new Point(5.6,7.8);
	}

}
