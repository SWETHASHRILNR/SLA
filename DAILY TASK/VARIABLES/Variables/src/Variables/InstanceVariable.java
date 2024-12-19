package Variables;
public class InstanceVariable 
{
	public String stuName;
	public int stuAge;
	public double stuMarks;
	private String stuPhNo;
	public InstanceVariable(String name, int age, double marks)
	{
		stuName = name;
		stuAge = age;
		stuMarks = marks;
	}
	public void setStuPhNo(String PhNo) {
		stuPhNo = PhNo;
	}
	public void stuDetails()
	{
		System.out.println("Name:"+stuName);
		System.out.println("Age:"+stuAge);
		System.out.println("Marks:"+stuMarks);
		System.out.println("Phone No.:"+stuPhNo);
	}
	public static void main(String[] args) 
	{
		InstanceVariable instance = new InstanceVariable("Swetha",25,345);
		instance.setStuPhNo("95678-12345");
		instance.stuDetails();
	}

}
