package Queue;

public class CircularQueueTest {
    
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(15);
        cq.enqueue(17);
        cq.enqueue(50);
        cq.enqueue(18);
        cq.enqueue(20);

        cq.display();

        System.out.println("Dequeue: "+cq.dequeue());
        System.out.println("Dequeue: "+cq.dequeue());
        System.out.println("Dequeue: "+cq.dequeue());
        System.out.println("Dequeue: "+cq.dequeue());
        System.out.println("Dequeue: "+cq.dequeue());
        System.out.println("Dequeue: "+cq.dequeue());
        
        cq.display();


    }
}
