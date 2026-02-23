import java.util.HashMap;
//The main controller class for the Hospital Management System

public class HospitalSystem {
    //Integrates PatientList, TreatmentQueue, DischargeStack, and HashMap
    private patientList patientlist;
    private TreatmentQueue treatmentqueue;
    private DischargeStack dischargestack;
    private HashMap<Integer,patient> patientMap;


    HospitalSystem(){
        //we create objects from another class to access them
        this.patientlist = new patientList();
        this.treatmentqueue = new TreatmentQueue();
        this.dischargestack = new DischargeStack();
        this.patientMap = new HashMap<>();
    }
    //Registers a new patient into the system
    public void addPatient(int id, String name, int severity, int age){
        patient newpatient = new patient(id,name,age,severity);
        //we add the patient both LinkedList and HashMap
        patientlist.addpatient(newpatient);

        patientMap.put(id,newpatient); //store in map for fast access

        System.out.println(name + " was added to the system");
    }
    //creates a treatment request for a patient
    public void addtreatmentRequest(int patientId){
        patient p = patientMap.get(patientId); //first of all, we try to find patientID on the HashMap
        if(p==null){  //if there is no this patient on the HashMap, the system will give a warning
            System.out.println("there is no this patient");
            return;
        }
        boolean isEmergency = false;
        if(p.severity > 8){             //if there is this patient, then check out whether priority or not
            isEmergency = true;
        }
        TreatmentRequest request = new TreatmentRequest(patientId,System.currentTimeMillis(),isEmergency);
        treatmentqueue.enqueue(request);
    }
    //Manually adds a discharge record
    public void addDischargeRecord(int patientID){
        if (!patientMap.containsKey(patientID)) {
            return;
        }
        DischargeRecord record = new DischargeRecord(patientID,System.currentTimeMillis());

        dischargestack.push(record);

    }
    //Processes the next patient in the queue
    //Moves patient from Treatmentqueue to DischargeStack
    public void processTreatment(){
        TreatmentRequest request = treatmentqueue.dequeue(); //next patient is left on the queue, if exist
        if(request != null){
            System.out.println("treatment is being done...     patient Id: " + request.patientID);
            DischargeRecord record = new DischargeRecord(request.patientID, System.currentTimeMillis());
            dischargestack.push(record);   //and the patient move to the dischargestack
        }
    }
    //Prints the current state of all system components
    public void printSystemState(){
        System.out.println("===========================================");
        System.out.println("         HOSPİTAL MANAGEMENT SYSTEM        ");
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
