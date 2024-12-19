package Overload;
public class DriveClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HelpClass help = new HelpClass();
		int intadd = help.add(3, 5);
		double doubleadd = help.add(33.564, 52.5677);
		System.out.println("Integer Addition="+intadd);
		System.out.println("Double Addition="+doubleadd);
	}
}
