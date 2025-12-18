public class DischargeStack {
    Node top; //Points to the top of the stack

    private class Node{
        Node next;
        DischargeRecord data;
        Node(DischargeRecord data){
            next = null;
            this.data = data;
        }
    }
    //Pushes a new record onto the top of the stack
    //time complexity is O(1)
    public void push(DischargeRecord record){
        Node newnode = new Node(record);
        if(top == null){  //adding element is always on the top of the stack
            top = newnode;
        }
        else{
            newnode.next = top;
            top =newnode;
        }
    }
    //Removes and returns the top record from the stack
    //time complexity is O(1)
    public DischargeRecord pop(){
        if(top==null){
            System.out.println("Stack is already empty");
            return null;
        }           //removing element is always on the top of the stach same as push
        else{
            Node temp = top;
            System.out.println(temp.data.patientId + " removed");
            top = top.next;
            return temp.data;
        }
        
    }
    //Returns the top record
    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return top.data.patientId;
        }
    }
    //Prints the stack from Top to Bottom
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
