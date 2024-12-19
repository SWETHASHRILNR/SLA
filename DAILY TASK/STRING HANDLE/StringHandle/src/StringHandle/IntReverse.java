package StringHandle;
import java.util.*;
public class IntReverse 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        int reverse = 0;
        for (; num != 0; num /= 10) 
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reversed integer: " + reverse);
	}
}
