public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Queue q2 = new Queue(5);
        q.enque(4);
        q.enque(2);
        q.enque(3);
        q.enque(5);
        q.enque(1);

        q2.enque(4);
        q2.enque(2);
        q2.enque(3);
        q2.enque(5);
        q2.enque(1);


        System.out.println("front: " + q.front.data);
        System.out.println("rear: " + q.rear.data);

        System.out.println("front: " + q.front.data);

        System.out.println(q.areequal(q, q2));


    }
}