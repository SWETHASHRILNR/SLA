package Task;
import java.util.Scanner;
class Students 
{
    private String name;
    private int rollNumber;
    private double marks;
    public Students(String name, int rollNumber, double marks) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void display() 
    {
    	System.out.println("\n\nSTUDENT DETIALS:");
        System.out.println("NAME: " + this.name);
        System.out.println("ROLL No.: " + this.rollNumber);
        System.out.println("MARKS: " + this.marks);
    }
}
public class Student {
    public static void main(String[] args) 
    {
        Scanner userinput = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = userinput.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNumber = userinput.nextInt();
        System.out.print("Enter your marks: ");
        double marks = userinput.nextDouble();
        
        Students stud = new Students(name, rollNumber, marks);
        stud.display();
    }
}
