package Task;
class OuterAdd
{
	void outeradd()
	{
		System.out.println("Add() in outer class");
	}
	class InnerSub
	{
		void innersub()
		{
			System.out.println("Sub() in inner class");
		}
	}
}
public class AddSub {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OuterAdd outerclass = new OuterAdd();
		OuterAdd.InnerSub innerclass = outerclass.new InnerSub();
		outerclass.outeradd();
		innerclass.innersub();
	}

}
