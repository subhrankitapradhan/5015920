package c_Sorting_Customer_Orders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 450.25),
            new Order(4, "David", 320.80)
        };

        BubbleSort.sort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[]{
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 450.25),
            new Order(4, "David", 320.80)
        };

        QuickSort.sort(orders);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
