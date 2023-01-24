package Queue;

/**
 * 
 * @author Mohammad J Teeti
 * @version 1.1
 * Simple Implemtation of the LinkedQueue ADT 
 * {@code Node} is implemented as Inner Class
 * class contains three main methods
 * {@code Push} add elements to the Queue
 * {@code Pop} add elements to the Queue
 * {@code display} Prints All Queue Content
 * 
 * The LinkedQueue Class is a Generic Type 
 * 
 */
public class LinkedQueue <T>{
    
    class Node {
        T value ;
        Node next;
    }

    Node head,rear;

    /**
     * Adds elements to the rear of the queue
     * @param value the value to be add 
     * @return the value of the rear element of the Queue
     */
    public T push (T value ){

        if (head == null){
            //first addition
            head = new Node();
            head.value=value;
            head.next=null;
            rear=head;
            return head.value;
        }

        Node newNode =new  Node();
        newNode.value=value;
        rear.next=newNode;
        rear=newNode;

        return rear.value;//returns head always 

    }

    /**
     * removes a value from the head of the queue
     * @return value of the head ,null if queue is empty
     */
    public T Pop(){

        if (head==null){
            System.out.println("Empty Queue!");
            return null;
        }
        Node temp =head;
        head=head.next;
        return temp.value;
    }

    /**
     * Recursion is used to inverse Queue display from rear to head 
     */
     
    public void display(Node head){

        if (head ==null)
            return ;
        
        display(head.next);
        System.out.print(head.value +" ");
        
    }
    

}
