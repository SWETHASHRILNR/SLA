package Array;
class Employee
{
	private String name;
	private int id;
	private String department;
	public Employee(String name, int id, String department)
	{
		this.name = name;
		this.id = id;
		this.department = department;
	}
	public void printDetails()
	{
		System.out.println("ID: " + id + " Name: " + name + " Department: " + department);
	}
}
public class EmployeeArrObj 
{
	public static void main(String[] args) 
	{
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee("Swetha", 100, "Developer");
		empArr[1] = new Employee("Shivane", 101, "Medical coder");
		empArr[2] = new Employee("Karthikeyan", 102, "Software engineer");
		empArr[0].printDetails();
		empArr[1].printDetails();
		empArr[2].printDetails();
	}

}
