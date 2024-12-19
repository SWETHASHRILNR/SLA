package Array;
import java.util.*;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of.elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int size = a.length;
		System.out.println("Enter the elements: ");
		for(int i=0; i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Even numbers:");
		for(int j=0; j<size; j++)
		{
			if(a[j]%2==0)
				System.out.println(a[j]+" ");
		}
		System.out.println("Oddnumbers:");
		for(int j=0; j<size; j++)
		{
			if(a[j]%2==1)
				System.out.println(a[j]+" ");
		}
	}
}
