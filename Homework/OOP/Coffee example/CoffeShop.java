public class CoffeShop {
    public String chc;
    public CoffeShop(String choose){
        switch(choose) {
            case "A":
                chc = "Americano $3.00";
            case "C":
                chc = "Cappucino $3.75";
            case "L":
                chc = "Latte $4.00";
            case "E":
                chc = "Espresso $2.50";
            default:
                chc = "invalid choice";
        }
    }
    public void printtoScreen(){
        System.out.println(chc);
    }
}
