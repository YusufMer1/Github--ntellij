public class Student {
    String name;
    int age;
    boolean isjunior;
    char gender;

    public Student(){
        name ="";
        age =0;
        isjunior=false;
        gender='m';
    }
    public Student(String name,int age,boolean isjunior,char gender){
        this.name = name;
        this.age = age;
        this.isjunior = isjunior;
        this.gender = gender;
    }
    public void info(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("is junior: " + isjunior);
        System.out.println("gender: " + gender);
    }
}
