package Task;
                 
public class Calculator
{
    int add, subtract, multiply;
    int first, second;
    
    public void calculator(int first, int second)
    {
        add = first + second;
        subtract = first - second;
        multiply = first * second;
		System.out.println("Sum = " + add);
		System.out.println("Difference = " + subtract);
		System.out.println("Multiplication = " + multiply);
    }
    
    public static void main(String args[])
    {
    	Calculator calc = new Calculator();
    	calc.calculator(45,56);
    }
}