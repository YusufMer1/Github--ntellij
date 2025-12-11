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
    //Adds a treatment request to appropriate queue
    //Time complexity is O(1)
    void enqueue(TreatmentRequest request){
        Node newnode = new Node(request);
        if(newnode.data.isPriority == true){  //first of all, we check out whether patient is priority or not
            if(emergencyfront == null){         //if the patient is priority, we add the patient end of the emergency queue
                emergencyfront = emergencyrear = newnode;
            }
            else{
                emergencyrear.next = newnode;
                emergencyrear = newnode;
            }
        }
        else{                           //if the patient is not priority, then we add the ptient end of the normal queue
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
    //Removes and reutrns the next request to be processed
    //always check the emergency queue first
    //Tİme complexity is O(1)
    TreatmentRequest dequeue(){
        if(size == 0){  //if the queue is empty, dont need to make procces
            System.out.println("the queue is already empty");
            return null;
        }
        else{
            TreatmentRequest dataToReturn;
            if(emergencyfront!=null) {          //if emergency queue is not empty, procces is made from emergency queue first
                dataToReturn = emergencyfront.data;
                emergencyfront = emergencyfront.next;
                if (emergencyfront == null) {
                    emergencyrear = null;
                }
            }
            else{                           //if emerceny queue is empty, proccess is made from normal queue
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
    //Displays the queue state, showing emergency first
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