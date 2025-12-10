import java.util.HashMap;

public class HospitalSystem {
    private patientList patientlist;
    private TreatmentQueue treatmentqueue;
    private DischargeStack dischargestack;
    private HashMap<Integer,patient> patientMap;

    HospitalSystem(){
        this.patientlist = new patientList();
        this.treatmentqueue = new TreatmentQueue();
        this.dischargestack = new DischargeStack();
        this.patientMap = new HashMap<>();
    }
    public void addPatient(int id, String name, int severity, int age){
        patient newpatient = new patient(id,name,age,severity);

        patientlist.addpatient(newpatient);

        patientMap.put(id,newpatient);

        System.out.println(name + " was added to the system");
    }
    public void addtreatmentRequest(int patientId){
        patient p = patientMap.get(patientId);
        if(p==null){
            System.out.println("there is no this patient");
            return;
        }
        boolean isEmergency = false;
        if(p.severity > 8){
            isEmergency = true;
        }
        TreatmentRequest request = new TreatmentRequest(patientId,System.currentTimeMillis(),isEmergency);
        treatmentqueue.enqueue(request);
    }
    public void addDischargeRecord(int patientID){
        if (!patientMap.containsKey(patientID)) {
            return;
        }
        DischargeRecord record = new DischargeRecord(patientID,System.currentTimeMillis());

        dischargestack.push(record);

    }
    public void processTreatment(){
        TreatmentRequest request = treatmentqueue.dequeue();
        if(request != null){
            System.out.println("treatment is being done...     patient Id: " + request.patientID);
            DischargeRecord record = new DischargeRecord(request.patientID, System.currentTimeMillis());
            dischargestack.push(record);
        }
    }
    public void printSystemState(){
        System.out.println("===========================================");
        System.out.println("         HOSPİTAL MANAGEMENT SYSTEM         ");
        System.out.println("===========================================");

        System.out.println();
        System.out.println("Patient List:");
        patientlist.sortBySeverity();
        patientlist.printlist();

        System.out.println();
        System.out.println("Treatment Queue:");
        treatmentqueue.printQueue();

        System.out.println();
        System.out.println("Discharge Patients:");
        dischargestack.printStack();

    }
}
