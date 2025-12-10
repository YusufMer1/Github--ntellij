//Represents a patient in the hospital system
//Stores personal details and medical severity
public class patient {
    int id;
    String name;
    int severity; //(1-10)
    int age;

    patient(int id,String name,int age,int severity){
        this.id = id;
        this.name = name;
        this.age = age;
        this.severity = severity;

    }
}
