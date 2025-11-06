public class Stack {
    int size;
    int cnt;
    Node head = null;
    Node middle =null;
    Node = tail;
    Stack(int size){
        this.size = size;
        cnt = 0;
        head = null;
        middle = null;
    }
    public void push(int data){
        Node element = new Node(data);
        if(head == null){
            head = element;
            tail = element;
            element.next = null;
            element.prev = null;
            cnt++;
        }
        else{
            element.prev = tail;
            tail.next = element;
            tail = element;
            cnt++;
            if(cnt ==1){
                middle = element;
            }
            else{
                middle = element.prev;
            }
        }
    }
    public void showlist(){
        Node temp = tail;
        for(int i = 0;i <cnt;i++){
            System.out.println(temp.data + " -->");
            temp = temp.prev;
        }
        System.out.println();
    }
    public void pop(){
        tail = tail.prev;
        cnt--;
        if(cnt % 2==0){
            middle = middle.prev;
        }
    }
}
