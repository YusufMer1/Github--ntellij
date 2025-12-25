public class Main {
    public static void main(String[] args) {
        MainDish md = new MainDish("Hamburger",250,false);
        Drink d = new Drink("Ice Tea",50,true);
        Dessert de = new Dessert("Profiterol",150,true);

        md.describe();
        System.out.println();
        d.describe();
        System.out.println();
        de.describe();
    }
}