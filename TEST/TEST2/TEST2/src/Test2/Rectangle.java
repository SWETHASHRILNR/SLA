package Test2;
public class Rectangle 
{
	double length,width;
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	Rectangle(Rectangle rec)
	{
		this.length = rec.length;
		this.width = rec.width;
	}
	public void display()
	{
		System.out.println("Rectangle Length:"+ length +" Width:" + width);
	}
	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle(4,5);
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		rec.display();
		Rectangle copyrec = new Rectangle(rec);
		System.out.println("COPY CONSTRUCTOR");
		copyrec.display();
	}

}
