public class Stack {
    int size;
    int cnt;
    Node head = null;
    Node middle =null;
    Node tail = null;
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
            middle = element;
            cnt++;
        }
        else{
            element.prev = tail;
            tail.next = element;
            tail = element;
            cnt++;
            if(cnt % 2 != 0){
                middle = middle.next;
            }
        }
    }
    public void showlist(){
        Node temp = tail;
        System.out.print("top --> ");
        for(int i = 0;i <cnt;i++){
            System.out.print(temp.data + " -->");
            temp = temp.prev;
        }
        System.out.print(" end");
        System.out.println();
    }
    public void pop(){
        tail = tail.prev;
        cnt--;
        if(cnt % 2==0){
            middle = middle.prev;
        }
    }
    public void deletemiddle(){
        middle.next.prev = middle.prev;
        middle.prev.next = middle.next;
        cnt--;
        if(cnt % 2 == 0){
            middle = middle.prev;

        }
        else{
            middle = middle.next;
        }
    }
}
