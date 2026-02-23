public class Dog extends Pet{
    String color;
    String breed;

    public Dog(String name, int age, boolean isMale) {
        super(name, age, isMale);
        this.color = color;
        this.breed = breed;
    }

    public Dog(int age, boolean isMale) {
        super(age, isMale);
        this.color = color;
        this.breed = breed;
    }

    public Dog(int i, boolean b, String white, String s) {
        super();
    }

    public void speak(){
        System.out.println("woof");
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getHumanAge(){
        return 7 * age;
    }
}