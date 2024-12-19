package ExceptionHandling;
import java.util.*;
public class Exception2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string(alpha/num): ");
		String s1 = sc.nextLine();
		try
		{
			Integer.parseInt(s1);
			System.out.println("Is a valid integer");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
