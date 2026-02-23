public class Main {
    public static void main(String[] args) {
        System.out.println("------Patient List-------");

        patientList pl = new patientList(); //on this part I craete a object from patientList class

        patient p1 = new patient(1234,"Mehmet",20,6);   //on this part I am creating patient
        patient p2 = new patient(1235,"Ali",19,7);
        patient p3 = new patient(1236,"Ayşe",22,8);
        patient p4 = new patient(1237,"Burak",25,4);
        patient p5 = new patient(1238,"Yusuf",21,3);

        pl.addpatient(p1); //I am adding patients that I created to the Linked list
        pl.addpatient(p2);
        pl.addpatient(p3);
        pl.addpatient(p4);
        pl.addpatient(p5);
        pl.sortBySeverity();

        pl.removepatient(1236); //remove a patient

        pl.findpatient(1238);   //try to find a specific patient

        pl.printlist(); //print the patient list

        System.out.println("--------Treatmen Queue---------");
        TreatmentQueue tq = new TreatmentQueue();   //on this part I create a queue from TreatmentQueue class
        tq.enqueue(new TreatmentRequest(101,System.currentTimeMillis(),false)); //on this part, I am adding patients to the my queue according to the severity level
        tq.enqueue(new TreatmentRequest(102,System.currentTimeMillis(),true));
        tq.enqueue(new TreatmentRequest(103,System.currentTimeMillis(),false));
        tq.enqueue(new TreatmentRequest(104,System.currentTimeMillis(),false));
        tq.enqueue(new TreatmentRequest(105,System.currentTimeMillis(),true));
        tq.enqueue(new TreatmentRequest(106,System.currentTimeMillis(),false));
        tq.enqueue(new TreatmentRequest(107,System.currentTimeMillis(),true));
        tq.enqueue(new TreatmentRequest(108,System.currentTimeMillis(),true));
        tq.dequeue();   //remove patient, if my priority queue is not empty then dequeue procces starts from there
        tq.dequeue();   //if not dequeue proccess starts from normal queue
        tq.dequeue();
        tq.printQueue();
        System.out.println("size: " + tq.size());  //print queue(normal queue + priority queue) size


        System.out.println("-----------DischargeStack--------------");
        DischargeStack ds = new DischargeStack(); //on this part I create a stack from DischargeStack class.
        ds.push(new DischargeRecord(201,System.currentTimeMillis())); //on this part I am adding the patients to the Stack
        ds.push(new DischargeRecord(202,System.currentTimeMillis()));
        ds.push(new DischargeRecord(203,System.currentTimeMillis()));
        ds.push(new DischargeRecord(204,System.currentTimeMillis()));
        ds.push(new DischargeRecord(205,System.currentTimeMillis()));
        ds.pop();  //in here, I am removing patient who enter last from stack
        ds.pop();
        ds.printStack();

        System.out.println();

        System.out.println("---------------Hospital Managment System--------------------");
        HospitalSystem hs = new HospitalSystem();
        hs.addPatient(12,"mert",10,21);
        hs.addPatient(13,"mehmet",7,20);
        hs.addPatient(14,"furkan",9,22);
        hs.addPatient(15,"yusuf",8,22);
        hs.addPatient(16,"esra",10,22);
        hs.addPatient(17,"fırat",5,21);
        hs.addPatient(18,"eren",3,22);
        hs.addPatient(19,"ılgın",7,22);
        hs.addPatient(20,"gizem",9,22);
        hs.addPatient(21,"alper",1,18);

        hs.addtreatmentRequest(12);
        hs.addtreatmentRequest(13);
        hs.addtreatmentRequest(14);
        hs.addtreatmentRequest(15);
        hs.addtreatmentRequest(16);
        hs.addtreatmentRequest(17);
        hs.addtreatmentRequest(18);
        hs.addtreatmentRequest(20);

        hs.addDischargeRecord(21);
        hs.addDischargeRecord(15);

        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();

        System.out.println();

        hs.printSystemState();
    }
}