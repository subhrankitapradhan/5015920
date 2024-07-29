package a_Inventory_Management_System;
import java.util.ArrayList;

public class InventoryManagementSystem {
    private ArrayList<Product> inventory;

    public InventoryManagementSystem() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        for (Product product : inventory) {
            if (product.getProductId().equals(productId)) {
                product.setQuantity(quantity);
                product.setPrice(price);
                return;
            }
        }
    }

    public void deleteProduct(String productId) {
        inventory.removeIf(product -> product.getProductId().equals(productId));
    }

    public Product getProduct(String productId) {
        for (Product product : inventory) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        Product product1 = new Product("P1", "Cricket", 10, 99.99);
        Product product2 = new Product("P2", "Hockey", 5, 149.99);
        ims.addProduct(product1);
        ims.addProduct(product2);

        // Displaying products
        System.out.println("Products after addition:");
        System.out.println(ims.getProduct("P1"));
        System.out.println(ims.getProduct("P2"));

        // Updating a product
        ims.updateProduct("P1", 20, 89.99);
        System.out.println("Products after update:");
        System.out.println(ims.getProduct("P1"));

        // Deleting a product
        ims.deleteProduct("P2");
        System.out.println("Products after deletion:");
        System.out.println(ims.getProduct("P1"));
        System.out.println(ims.getProduct("P2"));
    }
}

