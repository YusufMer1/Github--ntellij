public class Main {
    public static void main(String[] args) {
        PatientList pl = new PatientList();
        Patient p1 = new Patient(1234,"Mehmet",20,6);
        Patient p2 = new Patient(1235,"Ali",19,7);
        Patient p3 = new Patient(1236,"Ayşe",22,8);
        Patient p4 = new Patient(1237,"Burak",25,4);
        Patient p5 = new Patient(1238,"Yusuf",21,3);
        pl.addpatient(p1);
        pl.addpatient(p2);
        pl.addpatient(p3);
        pl.addpatient(p4);
        pl.addpatient(p5);

        pl.removepatient(1236);

        pl.findpatient(1238);

        pl.printlist();
    }
}