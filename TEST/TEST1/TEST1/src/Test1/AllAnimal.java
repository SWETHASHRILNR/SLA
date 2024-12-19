package Test1;
abstract class Animal
{
	abstract void makesound();
	public void name()
	{
		System.out.println("I am an animal");
	}
}
class Dog extends Animal
{
	void makesound()
	{
		System.out.println("I bark");
	}
}
public class AllAnimal 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog anidog = new Dog();
		anidog.name();
		anidog.makesound();
	}

}
