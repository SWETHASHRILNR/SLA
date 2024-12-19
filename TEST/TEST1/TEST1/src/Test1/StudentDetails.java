package Test1;
class Students
{
	String name;
	int roll_no;
	String phone_number;
	String address;
	Students(String name, int roll_no, String phone_number, String address)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.phone_number = phone_number;
		this.address = address;
	}
	void displayDetails()
	{
		System.out.println("NAME:"+this.name);
		System.out.println("ROLL No.:"+this.roll_no);
		System.out.println("PHONE NUMBER:"+this.phone_number);
		System.out.println("ADDRESS:"+this.address);
	}
}
public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Students s,s1;
		s = new Students("Sam",25,"98937-07654","Madurai");
		s1 = new Students("John",5,"97653-23456","Bangalore");
		System.out.println("Details of Student 1");
		s.displayDetails();
		System.out.println("\nDetails of Student 2");
		s1.displayDetails();

	}

}
