package b_E_commerce_Platform_Search_Function;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "T-shirt", "Clothing"),
            new Product(4, "Shoes", "Footwear")
        };

        // Linear Search
        int index = Linear_Search.search(products, "Smartphone");
        System.out.println("Linear Search Result: " + (index != -1 ? products[index] : "Product not found"));

        // Binary Search (requires sorted array by productName)
        Arrays.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));
        index = Binary_Search.search(products, "Smartphone");
        System.out.println("Binary Search Result: " + (index != -1 ? products[index] : "Product not found"));
    }
}

