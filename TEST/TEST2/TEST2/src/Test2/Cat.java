package Test2;
public class Cat 
{
	String name;
	int age;
	public Cat()
	{
		name = "Unknown";
		age = 0;
	}
	void display()
	{
		System.out.println("Cat's Name:" + name + " Age:" + age);
	}
	
	public static void main(String[] args)
	{
		Cat meow = new Cat();
		meow.display();
	}

}
