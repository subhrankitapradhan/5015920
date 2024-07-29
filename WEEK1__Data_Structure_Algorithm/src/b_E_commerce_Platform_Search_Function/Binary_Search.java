package b_E_commerce_Platform_Search_Function;

public class Binary_Search {
    public static int search(Product[] products, String target) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(target);

            if (comparison == 0) {
                return mid; // Target found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}

