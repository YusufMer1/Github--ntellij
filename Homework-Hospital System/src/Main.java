public class Main {
    public static void main(String[] args) {
        System.out.println("------Patient List-------");
        patientList pl = new patientList();
        patient p1 = new patient(1234,"Mehmet",20,6);
        patient p2 = new patient(1235,"Ali",19,7);
        patient p3 = new patient(1236,"Ayşe",22,8);
        patient p4 = new patient(1237,"Burak",25,4);
        patient p5 = new patient(1238,"Yusuf",21,3);
        pl.addpatient(p1);
        pl.addpatient(p2);
        pl.addpatient(p3);
        pl.addpatient(p4);
        pl.addpatient(p5);

        pl.removepatient(1236);

        pl.findpatient(1238);

        pl.printlist();

        System.out.println("--------Treatmen Queue---------");
        TreatmentQueue tq = new TreatmentQueue();
        tq.enqueue(new TreatmentRequest(101,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(102,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(103,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(104,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(105,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(106,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(107,System.currentTimeMillis()));
        tq.enqueue(new TreatmentRequest(108,System.currentTimeMillis()));
        tq.dequeue();
        tq.dequeue();
        tq.dequeue();
        tq.printQueue();
        System.out.println("size: " + tq.size());



    }
}
