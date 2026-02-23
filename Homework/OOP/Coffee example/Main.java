import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "A -> Americano -> $3.00\n" +
                "C -> Cappucino -> $3.75\n" +
                "L -> Latte -> $4.00\n" +
                "E -> Espresso -> $2.50";
        System.out.println(menu);
        System.out.println("please choose a coffee");
        String choose = input.nextLine();
        CoffeShop coffee1 = new CoffeShop((choose));
        coffee1.printtoScreen();

    }
}