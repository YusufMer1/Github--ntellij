public class patientList {
    int size = 0;
    Node head = null;
    Node tail = null;

    //adds a new patient to the end of the list
    //Time complexity is O(1)
    void addpatient(patient p){
        Node newnode = new Node(p);
        if(head ==null){  //we check out whether list is empty or not if empty newnode will be head and tail
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next =newnode; //we Link the new node to the end
            tail = newnode;   //update the tail value
        }
        size++;
    }
    private class Node{
        patient data;
        Node next;

        Node(patient data) {
            this.data = data;
            this.next = null;
        }
    }
    //remove a patient by their id
    //time complexity is O(N) worst case
    void removepatient(int id){
        if(head==null) return;

        if(head.data.id == id){ //firstly we check out head node
            head = head.next;
            size--;
            return;
        }
        //if patient is not on the head node, so we traverse the list to find patient
        Node temp = head;
        Node temp2 = head;
        while(temp != null){
            if(temp.data.id == id){
                temp2.next = temp.next;
                size--;
                return;
            }
            temp2 = temp;
            temp = temp.next;
        }
        System.out.println("No patient find");
    }
    //search for patient by ID
    //return the patient name if found, otherwise empty
    String findpatient(int id){
        Node temp = head;
        while(temp!=null){
            if(temp.data.id==id){
                System.out.println("Patient id " + temp.data.id + " was found");
                return temp.data.name;
            }
            temp = temp.next;
        }
        System.out.println("Patient id " + id + " wasn't found");
        return "";
    }
    //Prints all patients in a tabular format
    void printlist(){
        System.out.println("Patients");
        System.out.println("________");
        Node temp = head;
        System.out.printf("%-10s %-10s %-10s %-10s\n", "name","id","age","severity");
        System.out.println("_".repeat(40));
        while(temp != null){
            System.out.printf("%-10s %-10d %-10d %-10d\n",temp.data.name,temp.data.id,temp.data.age,temp.data.severity);
            temp = temp.next;
        }
        System.out.println();
    }
    //Sorts the list based on severity using Bubble Sort algorithm
    //Swaps data between nodes instead of changing links
    //time complexity is O(N^2)
    public void sortBySeverity(){
        if(head == null || head.next ==null){
            return;  //if there is no element or single element, dont require the sort of the list
        }
        boolean isSwap;
        Node current;
        do{
            isSwap = false;
            current = head;
            while(current.next!=null){
                if(current.data.severity < current.next.data.severity){
                    //sorting logic: higher severity need to come first
                    /*That is, it will start from current and go to the end of the list. If it encounters a higher severity, the values
                    after current and current will be swapped.*/
                    patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    isSwap=true;
                }
                current = current.next;
            }
        }while(isSwap==true);
    }
}