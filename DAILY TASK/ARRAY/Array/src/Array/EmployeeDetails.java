package Array;
import java.util.*;

public class EmployeeDetails 
{
    static class Employee
    {
        String name;
        int id;
        double salary;
        
        Employee(String name, int id, double salary)
        {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        void printDetails()
        {
            System.out.println("Employee Details:");
            System.out.println("Name: " + this.name + ", ID: " + this.id + ", Salary: " + this.salary);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline
        
        Employee[] employees = new Employee[n];  // Array to store employee objects
        
        System.out.println("Enter employee details:");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();  // Consume newline
            
            employees[i] = new Employee(name, id, salary);
        }
        
        System.out.println("\nEmployee Information:");
        for (Employee emp : employees) 
        {
            emp.printDetails();
            System.out.println();
        }
        
        sc.close();
    }
}
