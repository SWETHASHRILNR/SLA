package Overload;

public class Student 
{
	int id, age, marks;
	String name;
	Student(int id, String name)
	{
		this.id= id;
		this.name =name;
		System.out.println("Name:"+this.name+"\tID:"+this.id);
	}
	Student(int i, String n, int a)
	{
		id=i;
		name = n;
		age = a;
		System.out.println("Name:"+name+"\tID:"+id+"\tAge:"+age);
	}
	Student(int i, String n, int a, int m)
	{
		id=i;
		name = n;
		age = a;
		marks = m;
		System.out.println("Name:"+name+"\tID:"+id+"\tAge:"+age+"\tMarks:"+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s;
		s=new Student(1,"Swetha");
		s=new Student(1,"Shivu",25);
		s=new Student(1,"Karthi",25,90);
	}
}
