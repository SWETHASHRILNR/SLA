package Task;
abstract class Animal
{
	abstract void sound();
}
class Lion extends Animal
{
	void sound()
	{
		System.out.println("Lion growls");
	}
}
class Tiger extends Animal
{
	void sound()
	{
		System.out.println("Tiger roars");
	}
}
public class AbstractAnimal {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal name;
		name = new Lion();
		name.sound();
		name = new Tiger();
		name.sound();
	}
}
