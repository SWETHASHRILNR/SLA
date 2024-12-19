package Test1;
class Circle
{
	double radius = 1.0;
	String color = "red";
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}
public class TestCircle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle cir = new Circle();
		double area = cir.getArea();
		System.out.println("Area of Circle="+area);
	}

}
