public class Drink extends Food{
    private boolean cold;
    public Drink(String name, double price,boolean cold) {
        super(name, price);
        this.cold = cold;
    }
    public void describe(){
        System.out.print("Drink: " + getInfo());
        if(cold){
            System.out.println(" (cold) ");
        }
        else{
            System.out.println(" (not cold) ");
        }
    }
}
