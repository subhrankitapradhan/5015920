package b_E_commerce_Platform_Search_Function;

public class Linear_Search{
    public static int search(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(target)) {
                return i;
            }
        }
        return -1; // Target not found
    }
}
