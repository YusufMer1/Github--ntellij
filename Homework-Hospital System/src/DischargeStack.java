public class DischargeStack {
    Node top;

    private class Node{
        Node next;
        DischargeRecord data;
        Node(DischargeRecord data){
            next = null;
            this.data = data;
        }
    }
    public void push(DischargeRecord record){
        Node newnode = new Node(record);
        if(top == null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
        }
    }
    public DischargeRecord pop(){
        if(top==null){
            System.out.println("Stack is already empty");
            return null;
        }
        else{
            Node temp = top;
            System.out.println(temp.data.patientId + " removed");
            top = top.next;
            return temp.data;
        }
        
    }
    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return top.data.patientId;
        }
    }
    public void printStack(){
        Node temp = top;
        System.out.print("top --> ");
        while(temp!=null){
            System.out.print(temp.data.patientId + " --> ");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

}
