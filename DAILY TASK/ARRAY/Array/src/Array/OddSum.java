package Array;

import java.util.Scanner;
class OddSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =sc.nextInt();
		int sum = 0;
		for(int s=1;s<=l;s++)
		{
			if(s%2==1)
				sum = sum + s;
		}
		System.out.println("Sum of Odd Numbers :"+sum);
	}
}