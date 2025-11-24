public class TreatmentQueue {
    Node front;
    Node rear;
    int size;
    TreatmentQueue(){
        front = rear = null;
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
        if(size==0){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
        size++;
    }
    TreatmentRequest dequeue(){
        if(size==0){
            System.out.println("the queue is already empty");
            return null;
        }
        else{
            TreatmentRequest dataToReturn = front.data;
            front = front.next;
            if(front==null){
                rear=null;
            }
            size--;
            return dataToReturn;
        }
    }
    int size(){
        return size;
    }
    void printQueue(){
        Node temp = front;
        int num = 1;
        while(temp!=null){
            System.out.println(num + ". " + temp.data.patientID);
            temp = temp.next;
            num++;
        }
        System.out.println();
    }

}
