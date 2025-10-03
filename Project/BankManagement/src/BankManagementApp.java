/**
 * Main application class to launch the Bank Management System.
 */
public class BankManagementApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        UserInterface ui = new UserInterface(bank);
        ui.start();
    }
}
