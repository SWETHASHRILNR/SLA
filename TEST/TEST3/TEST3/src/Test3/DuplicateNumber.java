package Test3;
import java.util.*;
public class DuplicateNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int e = sc.nextInt();
		int n[] = new int[e];
		System.out.print("Enter all the elements: ");
		for(int i=0; i<n.length; i++)
			n[i]=sc.nextInt();
		System.out.println("The elements are: ");
		for(int i=0; i<n.length; i++)
			System.out.print(n[i]+" ");
		checkDuplicate(n);
	}
	public static void checkDuplicate(int n[])
	{
		try
		{
			for(int i=0; i<n.length; i++)
				for(int j=i+1; j<n.length; j++)
					if(n[i]==n[j])
						throw new Exception("Duplicate element found "+n[i]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}

}
