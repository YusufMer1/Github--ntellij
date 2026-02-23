public class TreatmentRequest {
    int patientID;
    long arrivalTime;
    boolean isPriority;
    TreatmentRequest(int patientID,long arrivaltime,boolean isPriority){
        this.patientID = patientID;
        this.arrivalTime = arrivaltime;
        this.isPriority = isPriority;
    }

}
