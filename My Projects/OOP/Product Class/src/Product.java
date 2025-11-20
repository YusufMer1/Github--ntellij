public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productID;
    private static int idCounter=1;
    Product(){
        name = "Unknown";
        quantity = 0;
        price = 0;
    }
    Product(String name,int quantity,int price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        productID = idCounter;
        idCounter++;
    }
    String getName(){
        return name;
    }
    int getQuantity(){
        return quantity;
    }
    double getPrice(){
        return price;
    }
    int getProductid(){
        return productID;
    }
    public static int getidCounter(){
        return idCounter;
    }
    public double getitemValue(){
        return price*quantity;
    }
    void setName(String name){
        this.name = name;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void setPrice(double price){
        this.price = price;
    }
    String tosString(){
        return "name: " + name + "  price: " + price;
    }


}
