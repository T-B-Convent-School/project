import java.util.Scanner;

/**
 * Provides user interaction for inventory management.
 */
public class InventoryManager {
    private Inventory inventory;
    private Scanner scanner;

    public InventoryManager() {
        inventory = new Inventory();
        scanner = new Scanner(System.in);
    }

    public void runMenu() {
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Display Products");
            System.out.println("5. Search Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> removeProduct();
                case 3 -> updateQuantity();
                case 4 -> inventory.displayProducts();
                case 5 -> searchProduct();
                case 6 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(id, name, quantity);
        inventory.addProduct(product);
    }

    private void removeProduct() {
        System.out.print("Enter Product ID to Remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        inventory.removeProduct(id);
    }

    private void updateQuantity() {
        System.out.print("Enter Product ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter New Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        inventory.updateQuantity(id, quantity);
    }

    private void searchProduct() {
        System.out.print("Enter Product ID to Search: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product product = inventory.findProduct(id);
        if (product != null) {
            System.out.println("Found Product:");
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }
    }
}
