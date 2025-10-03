/**
 * Handles transactions like deposit and withdrawal.
 */
public class Transaction {

    // Perform deposit transaction
    public static void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Perform withdrawal transaction
    public static void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}
