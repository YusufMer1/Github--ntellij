public class patientList {
    int size = 0;
    patient head = null;
    patient tail = null;
    void addpatient(patient p){
        if(size == 0){
            head = p;
            tail = p;
            size++;
        }
        else {
            tail.next = p;
            tail = p;
            size++;
        }
    }
    void removepatient(int id){
        patient temp = head;
        patient temp2 = head;
        while(temp != null){
            if(temp.id == id){
                temp2.next = temp.next;
                size--;
                return;
            }
            temp2 = temp;
            temp = temp.next;
        }
        System.out.println("No patient find");
    }
    String findpatient(int id){
        patient temp = head;
        while(temp!=null){
            if(temp.id==id){
                System.out.println("Patient id " + temp.id + " was found");
                return temp.name;
            }
            temp = temp.next;
        }
        System.out.println("Patient id " + id + " wasn't found");
        return "";
    }
    void printlist(){
        System.out.println("Patients");
        System.out.println("________");
        patient temp = head;
        System.out.printf("%-10s %-10s %-10s %-10s\n", "name","id","age","severity");
        System.out.println("_".repeat(40));
        while(temp != null){
            System.out.printf("%-10s %-10d %-10d %-10d\n",temp.name,temp.id,temp.age,temp.severity);
            temp = temp.next;
        }
        System.out.println();
    }
}
