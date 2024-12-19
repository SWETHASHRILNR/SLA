package Variables;
public class LocalVariable 
{
	public void localAdd()
	{
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	public static void main(String[] args) 
	{
		LocalVariable local = new LocalVariable();
		local.localAdd();
	}
}
