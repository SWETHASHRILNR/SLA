package Test3;
import java.util.*;
public class OddMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		OddMethodException(n);
	}
	public static void OddMethodException(int n)
	{
		try
		{
			if(n%2 == 1)
				throw new Exception("Number is odd");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
