public class Citrus extends Fruit{
    protected double vitaminCmg;

    public Citrus(String name, double calories, double vitaminCmg) {
        super(name, calories);
        this.vitaminCmg = vitaminCmg;
    }
    public void describe(){
        super.describe();
        System.out.println(vitaminCmg);
    }
}