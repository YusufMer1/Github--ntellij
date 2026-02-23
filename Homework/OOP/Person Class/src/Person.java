public class Person {
    private int id;
    private String name;
    private int age;
    private static int idCounter= 100;
    Person(){
        name = "Selma";
        age = 15;
        id = idCounter;
        idCounter++;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
        id=idCounter;
        idCounter++;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static int getIdCounter(){
        return idCounter;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

}
