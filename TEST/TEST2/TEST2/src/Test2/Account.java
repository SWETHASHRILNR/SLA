package Test2;
public class Account 
{
	private String accountNumber;
	private double balance;
	public Account(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		if(accountNumber == null || accountNumber.isEmpty())
		{
			System.out.println("Account number should not be null and empty");
		}
		if(balance < 0)
		{
			System.out.println("Balance should be negative");
		}
	}
	public static void main(String[] args) 
	{
		Account acc, acc1;
		acc = new Account("IFSC789",267.98);
		System.out.println("Account number: " + acc.accountNumber);
		System.out.println("Balance: " + acc.balance);
		acc1 = new Account("",-123);
	}

}
