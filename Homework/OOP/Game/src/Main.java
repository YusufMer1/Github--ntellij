public class Main {
    public static void main(String[] args) {
        GameCharacter p1 = new GameCharacter("Warrior",1,100);
        p1.takeDamage(30);
        p1.heal(10);
        System.out.println(p1.GetName() + " inormations");
        System.out.println("level: " + p1.getLevel());
        System.out.println("heal: " + p1.getHealth());
        System.out.println(p1.getInfo());
        GameCharacter p2 = new GameCharacter("Mage",3,80);
        System.out.println(p2.GetName() + " informations");
        System.out.println(p2.getInfo());
        GameCharacter p3 = new GameCharacter("assasin",5,100);
    }
}