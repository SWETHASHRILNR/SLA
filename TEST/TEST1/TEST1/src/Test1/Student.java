package Test1;
public class Student 
{
	String name;
	int roll_no;
	void display(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
		System.out.println("Name:"+this.name+"\tRoll No.:"+this.roll_no);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.display("Swetha", 25);
	}
}
