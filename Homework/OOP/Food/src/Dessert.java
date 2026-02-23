public class Dessert extends Food {
    private boolean containSugar;

    public Dessert(String name, double price,boolean containSugar) {
        super(name, price);
        this.containSugar = containSugar;
    }
    public void describe(){
        System.out.print("Dessert: " + getInfo());
        if(containSugar){
            System.out.println(" (sugar) ");
        }
        else{
            System.out.println(" (not sugar) ");
        }
    }
}
