package StringHandle;
import java.util.*;
public class EvenorOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		if((num & 1) == 0)
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Odd");
	}
}