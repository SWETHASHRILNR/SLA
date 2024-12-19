package ControlStatements;
import java.util.*;
public class switchCalc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("Enter 2 numbers:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = 0;
		System.out.println("Choose an operation('+','-','*','/'): ");
		char operator = sc.next().charAt(0);
		switch(operator)
		{
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			System.out.println("Invalid operator");
		}
		System.out.println("RESULT: "+result);
	}

}
