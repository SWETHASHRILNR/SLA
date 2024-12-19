package Test1;

abstract class BankAccount {
    String account_number;
    double balance;

    // Constructor to initialize account number and balance
    BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    // Abstract methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {

    // Constructor for CheckingAccount
    CheckingAccount(String account_number, double balance) {
        super(account_number, balance);  // Initialize the account_number and balance
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        // Creating CheckingAccount instance with an initial balance of 1000
        CheckingAccount account = new CheckingAccount("12345", 1000);
        
        account.deposit(500);
        account.withdraw(570);
        account.deposit(600.75);
        account.withdraw(350);
        account.deposit(0);  // Invalid deposit amount
    }
}
