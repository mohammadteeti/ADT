package Queue;

public class LinkedQueueTest {
    
    public static void main(String[] args) {
        
        LinkedQueue<Integer> lq = new LinkedQueue<Integer>();

        System.out.println("Add : " +lq.push(50));
        System.out.println("Add : " +lq.push(71));
        System.out.println("Add : " +lq.push(30));
        System.out.println("Add : " +lq.push(12));
        System.out.println("Add : " +lq.push(19));

        lq.display(lq.head);
        System.out.println();

        System.out.println("Pop : "+ lq.Pop());
        System.out.println("Pop : "+ lq.Pop());
        

        lq.display(lq.head);
        System.out.println();



    }
}
