public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone17",78000,23);
        Product p2 = new Product();
        System.out.println(p1.getName() + ": " + p1.getProductid());
        System.out.println(p2.getName() + ": " + p2.getProductid());
        System.out.println("IPHONE17");
        System.out.println("name: " + p1.getName());
        System.out.println("quantity: " + p1.getQuantity());
        System.out.println("price: " + p1.getPrice());
        System.out.println("itemvalue: " + p1.getitemValue());
        p2.setName("Galaxy Z Fold7");
        p2.setQuantity(20);
        p2.setPrice(50000);
        System.out.println(p2.tosString());
    }
}