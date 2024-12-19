package Test3;
import java.util.*;
public class CheckVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String check = str.toLowerCase();
		System.out.println("Converted to Lowercase:"+check);
		CheckforVowels(check);
	}
	public static void CheckforVowels(String check)
	{
		try 
		{
			for(int i=0; i<check.length(); i++)
			{
				char ch = check.charAt(i);
				if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
					throw new Exception("Has vowel");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
