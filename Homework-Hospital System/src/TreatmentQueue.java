public class TreatmentQueue {
    Node normalfront;
    Node normalrear;
    Node emergencyfront;
    Node emergencyrear;
    int size;
    ;
    TreatmentQueue(){
        normalfront = normalrear = emergencyfront = emergencyrear = null;
       size = 0;
    }

    private class Node{
        TreatmentRequest data;
        Node next;
        Node(TreatmentRequest data){
            this.data=data;
        }
    }
    void enqueue(TreatmentRequest request){
        Node newnode = new Node(request);
        if(newnode.data.isPriority == true){
            if(emergencyfront == null){
                emergencyfront = emergencyrear = newnode;
            }
            else{
                emergencyrear.next = newnode;
                emergencyrear = newnode;
            }
        }
        else{
            if(normalfront== null){
                normalfront = normalrear = newnode;
            }
            else{
                normalrear.next = newnode;
                normalrear = newnode;
            }

        }
        size++;
    }
    TreatmentRequest dequeue(){
        if(size == 0){
            System.out.println("the queue is already empty");
            return null;
        }
        else{
            TreatmentRequest dataToReturn;
            if(emergencyfront!=null) {
                dataToReturn = emergencyfront.data;
                emergencyfront = emergencyfront.next;
                if (emergencyfront == null) {
                    emergencyrear = null;
                }
            }
            else{
                dataToReturn = normalfront.data;
                normalfront = normalfront.next;
                if(normalfront==null){
                    emergencyrear=null;
                }
            }
            size--;
                return dataToReturn;
            }

        }

    int size(){
        return size;
    }
    void printQueue(){
        System.out.println("Emergency Queue");
        Node temp = emergencyfront;
        int emergencynum = 1;
        System.out.println("______________");
        System.out.println("  ID");

        while(temp!=null){
            System.out.println(emergencynum + "." + temp.data.patientID);
            temp = temp.next;
            emergencynum++;
        }
        System.out.println();
        System.out.println("Normal Queue");
        Node ntemp = normalfront;
        int normalnum = 1;
        System.out.println("______________");
        System.out.println("  ID");

        while(ntemp!=null){
            System.out.println(normalnum + "." + ntemp.data.patientID);
            ntemp = ntemp.next;
            normalnum++;
        }
    }
}