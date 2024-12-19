package Test2;
public class GofThree 
{
	public static int gnum(int a,int b, int c)
	{
		if(a>=b && b<=c)
		{
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static double gnum(double a,double b, double c)
	{
		if(a>=b && b<=c)
		{
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static void main(String[] args) 
	{
		GofThree gof = new GofThree();
		int intres = gof.gnum(3, 45, 0);
		double doures = gof.gnum(4.5,6,8.90);
		System.out.println(">est of 3 Integer numbers "+intres);
		System.out.println(">est of 3 Double numbers "+doures);
	}

}
