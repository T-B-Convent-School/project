import java.util.Scanner;

/**
 * Handles user interaction and menu display.
 */
public class UserInterface {
    private Bank bank;
    private Scanner scanner;

    public UserInterface(Bank bank) {
        this.bank = bank;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nBank Management System Menu");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: bank.displayAllAccounts(); break;
                case 5: System.out.println("Exiting..."); scanner.close(); System.exit(0);
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();

        Account account = new Account(accNum, accHolder, initialDeposit);
        bank.addAccount(account);
    }

    private void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = bank.findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            Transaction.deposit(acc, amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = bank.findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            Transaction.withdraw(acc, amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
