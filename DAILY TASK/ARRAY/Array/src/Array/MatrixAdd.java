package Array;
import java.util.*;
public class MatrixAdd 
{
	public static void main(String[] args) 
	{
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of. rows in 1st matrix: ");
		p = s.nextInt();
		System.out.print("Enter no.of. columns in 1st matrix: ");
		q = s.nextInt();
		System.out.print("Enter no.of. rows in 2nd matrix: ");
		m = s.nextInt();
		System.out.print("Enter no.of. columns in 2nd matrix: ");
		n = s.nextInt();
		if(p==m && q==n)
		{
			int matrix1[][] = new int[p][q];
			int matrix2[][] = new int[m][n];
			int sum[][] = new int[m][n];
			//To get
			System.out.print("Enter all the elements of 1st matrix:");
			for(int i=0; i<p; i++)
				for(int j=0; j<q; j++)
					matrix1[i][j] = s.nextInt();
			
			System.out.print("Enter all the elements of 2nd matrix:");
			for(int i=0; i<m; i++)
				for(int j=0; j<n; j++)
					matrix2[i][j] = s.nextInt();
			
			//To print
			System.out.println("Matrix 1:");
			for(int i=0; i<m; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.println("");
			}
			System.out.println("Matrix 2:");
			for(int i=0; i<m; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.println("");
			}
			//Matrix Addition
			for(int i=0; i<p; i++)
			{
				for(int j=0; j<n; j++)
				{
					for(int k=0; k<q; k++)
					{
						sum[i][j] = matrix1[i][j] + matrix2[i][j];
					}
				}
			}
			//The Result
			System.out.println("Addition of Matrices:");
			for(int i=0; i<p; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(sum[i][j] + " ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Addition cannot be performed");
		}
	}
}
