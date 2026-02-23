public class Cat {
    int x;
    double direction;
    String name;
    Cat(){
        x = 0;
        direction = 180;
        name = "Sofya";
        new Cat(x,direction,name);
    }
    Cat(int x, double direction, String name){
         this.x=x;
         this.direction=direction;
         this.name=name;
    }
    public void move(){
        x = x + 20;
    }
    public void move(int a){
        x = x + a;
    }
    public void turn(double angle){
        direction = direction + angle;

    }
    public void status(){
        System.out.println("x: " + x);
        System.out.println("direction: " + direction);
        System.out.println("name: " + name);
        System.out.println();
    }
}
