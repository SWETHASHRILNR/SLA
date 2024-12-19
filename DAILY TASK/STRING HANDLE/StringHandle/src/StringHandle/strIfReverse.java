package StringHandle;
import java.util.*;
public class strIfReverse 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		scanner.close();
		String reverse = "";
		int i = str.length() - 1;
		while (true) 
		{
		    if (i < 0) 
		    {
		        break;
		    }
		    reverse += str.charAt(i);
		    i--;
		}
		System.out.println("Reversed string: " + reverse);
	}
}
/*String s = "Swetha";
String reversestr = "";
char ch;
int len = s.length();
System.out.println("Original String: " + s);
System.out.println("Length: " + len);
int i=len-1;
while(i>=0)
{
	ch = s.charAt(i);
	reversestr+=ch; 
	i--;
}
System.out.println("Reversed String: " + reversestr);*/
