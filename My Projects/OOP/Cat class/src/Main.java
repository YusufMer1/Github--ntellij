public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5,45,"Lucy");
        cat1.move();
        cat2.move(20);
        cat1.status();
        cat2.status();
    }
}