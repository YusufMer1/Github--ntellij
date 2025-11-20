public class Queue {
    Node front;
    Node rear;
    int size;
    int num;

    Queue(int size) {
        this.size = size;
        front = null;
        rear = null;
        num = 0;

    }

    void enque(int data) {
        Node element = new Node(data);
        if (front == null) {
            front = element;
            rear = element;
            num++;
        } else if (num <= 5) {
            rear.next = element;
            rear = element;
            num++;
        } else {
            System.out.println("list is full");
        }
    }

    void deque() {
        if (front == null) {
            System.out.println("list is empty");
        } else {
            front = front.next;
            num--;
        }
    }

    boolean areequal(Queue q1, Queue q2) {
        if (q1.size == q2.size) {

            Node temp1 = q1.front;
            Node temp2 = q2.front;
            while (temp1 != null && temp2 != null) {
                if (temp1.data != temp2.data) return false;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return true;
        } else {
            System.out.println("size not same");
            return false;
        }
    }
}
