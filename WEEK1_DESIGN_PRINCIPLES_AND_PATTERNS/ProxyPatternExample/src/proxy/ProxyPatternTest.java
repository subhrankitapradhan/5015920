package proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk and then displayed
        image1.display();
        System.out.println("");

        // Image will not be loaded from disk again
        image1.display();
        System.out.println("");

        // Image will be loaded from disk and then displayed
        image2.display();
        System.out.println("");

        // Image will not be loaded from disk again
        image2.display();
    }
}
