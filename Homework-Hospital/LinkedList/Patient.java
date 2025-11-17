public class Patient {
    int id;
    String name;
    int severity; //(1-10)
    int age;
    Patient next;
    Patient(int id,String name,int age,int severity){
        this.id = id;
        this.name = name;
        this.age = age;
        this.severity = severity;
        next = null;
    }
}
