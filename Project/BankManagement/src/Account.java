/**
 * Represents a bank account with basic operations.
 */
public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Deposit money to account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Enter a positive amount.");
        }
    }

    // Withdraw money from account if sufficient balance
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }
        System.out.println("Insufficient balance or invalid amount.");
        return false;
    }

    // Display account info
    public String getAccountInfo() {
        return "Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance;
    }
}
