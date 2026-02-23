import java.util.Objects;

public class Pet {
    String name;
    String owner;
    int age;
    boolean isMale;

    public Pet(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public Pet(int age, boolean isMale) {
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }
    public void beAdopted(String owner,String name){
        this.owner = owner;
        this.name = name;
    }
    protected static boolean isNullOrEmpty(String s){
        if("".equals(s) || s == null){
            return true;
        }
        return false;
    }
    protected boolean hasOwner(String s){
        if(!isNullOrEmpty(s)){
            return true;
        }
        return false;
    }
    public void changeName(String name){
        this.name = name;
    }
}