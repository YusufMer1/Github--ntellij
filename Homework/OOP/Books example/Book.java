public class Book {
    String title;
    String author;
    double price;
    public Book(){
        title = "";
        author = "";
        price = 0;
    }
    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void showdetails(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
}
