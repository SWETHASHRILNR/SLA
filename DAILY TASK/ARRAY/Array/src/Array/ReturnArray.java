package Array;
public class ReturnArray 
{
	public static void main(String[] args)
	{
		int[] num = sumArray();
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]+num[i+1]+" ");
	}
	public static int[] sumArray()
	{
		int[] no = {3,4,5,7};
		return no;
	}

}
