import java.util.ArrayList;
import java.util.List;

/**
 * Manages multiple accounts and their operations.
 */
public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add new account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    // Search account by account number
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Show all accounts
    public void displayAllAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountInfo());
        }
    }
}
