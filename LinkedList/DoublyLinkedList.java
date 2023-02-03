package LinkedList;

/**
Implement Doubly Linked list in java
only addition and display methods are provided as 
the concept is already illustrated in the Normal LinkedList
Code
*/
public class DoublyLinkedList<T> {
    
    class Node {
        T value;
        Node prev,next;
        Node(T v,Node p,Node n){
            value=v;
            prev=p;
            next=n;
        }
    }

    Node head =null;
    Node tail=null;
    public void add(T value){
        Node newNode;
        if(head==null){
            newNode= new Node(value,null,null);
            head = newNode;
            tail=head;
            return;
        }

        newNode = new Node(value , tail,null );
        tail.next=newNode;
        tail=newNode;
    }

    public void display(){

        Node n =head;

        while(n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }

    public void displayInReverse(){
        Node n=tail ;

        while (n!=head){
            System.out.println(n.value);
            n=n.prev;
        }
        System.out.println(head.value);

    }
}
