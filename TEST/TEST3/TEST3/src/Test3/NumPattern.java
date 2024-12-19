package Test3;
public class NumPattern 
{
	public static void main(String[] args) 
	{
		int[] diff = {5,4,3,4};
		int beg = 1;
		System.out.print(beg);
		for(int i=0; i<diff.length; i++)
		{
			beg += diff[i];
			System.out.print(" "+beg);
		}
	}
}