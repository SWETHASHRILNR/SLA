package StringHandle;
public class NaturalNumber 
{
	public static void main(String[] args) 
	{
        int i = 1;
        System.out.println("Natural numbers from 1-10:");
        while (i <= 10) 
        {
            System.out.print(i + " ");
            i = -~i;
        }
	}
}
