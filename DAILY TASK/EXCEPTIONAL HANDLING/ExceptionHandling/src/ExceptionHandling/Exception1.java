package ExceptionHandling;
import java.util.*;
public class Exception1 
{
	public static void main(String[] args) 
	{
		int a = 0;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number: ");
			a = sc.nextInt();
			if(a>100 && a<0)
				System.out.println("Not valid");
			else
				System.out.println("Valid");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
