public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower("Pink","Rose",1.5);
        Bouquet b1 = new Bouquet("Valentine's Day",f1,13);
        System.out.println(b1.getCost());
    }
}