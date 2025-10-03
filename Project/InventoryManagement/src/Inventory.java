import java.util.ArrayList;
import java.util.List;

/**
 * Manages a collection of products.
 */
public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    // Remove a product by ID
    public boolean removeProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                System.out.println("Removed product: " + product.getName());
                return true;
            }
        }
        System.out.println("Product not found: " + productId);
        return false;
    }

    // Update quantity for a product
    public boolean updateQuantity(int productId, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setQuantity(newQuantity);
                System.out.println("Updated quantity for " + product.getName() + " to " + newQuantity);
                return true;
            }
        }
        System.out.println("Product not found: " + productId);
        return false;
    }

    // Display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Current Inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Find product by ID
    public Product findProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
