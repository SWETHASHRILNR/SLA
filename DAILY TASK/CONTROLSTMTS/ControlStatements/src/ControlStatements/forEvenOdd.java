package ControlStatements;
public class forEvenOdd 
{
	public static void main(String[] args) 
	{
		int i;
		int n=50;
		System.out.println("Even numbers upto 50:");
		for(i=0;i<=n;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
		
		System.out.println("\nOdd numbers upto 50:");
		for(i=0;i<=n;i++)
		{
			if(i%2 == 1)
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}
