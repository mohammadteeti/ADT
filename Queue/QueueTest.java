package Queue;

public class QueueTest {
    
    
    public static void main(String[] args) {
            Queue q = new Queue(5);

            System.out.println("Add: " + q.push(10));
            System.out.println("Add: " + q.push(7));
            System.out.println("Add: " + q.push(80));
            System.out.println("Add: " + q.push(200));

            q.display();

            System.out.println("Pop : "+ q.pop());

            q.display();
            System.out.println("Pop : "+ q.pop());

            q.display();
            System.out.println("Pop : "+ q.pop());

            q.display();
            System.out.println("Pop : "+ q.pop());
            q.display();

            System.out.println("Add: " + q.push(200));
            System.out.println("Add: " + q.push(50));
            System.out.println("Add: " + q.push(70));
            System.out.println("Add: " + q.push(90));
            System.out.println("Add: " + q.push(121));
            System.out.println("Add: " + q.push(60));

            




    }
}
