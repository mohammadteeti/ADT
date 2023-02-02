package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    
    class Node {
        
        T value;
        Node next;
        

        Node(T value , Node next){
            this.value=value;
            this.next=next;
        }

    }

    Node head ,tail;
    int length ;
    
    { 
        head=null;
        tail=null;
        length=0;
    };

    
    public void add (T value){// adds Element to the end of the list

        if (head ==null){
            head = new Node(value,null);
            tail=head;
            length++;
            return;
        }

        Node newNode = new Node(value,null);
        tail.next=newNode;
        tail=newNode;
        length++;

    }

    public void addAtBeggining(T value){

        Node newNode= new Node(value, null);
        if (head == null){
            head= newNode;
            tail=head;
            length++;
            return;

        }

        newNode.next=head;
        head=newNode;

        length++;
        return;




    }

    public Node deleteFromBegining (){

        if (head == null){
            System.out.println("Empty List");
            return null;
        }

        Node temp=head ;
        head=head.next;
        temp.next=null;// either we left it to gc to destroty the node 
                        //or we can assign it to null from here ,but return nothing 
        length--;
        System.out.println(temp.value +" Deleted");
        return temp;

    }

    public Node deleteFromEnd(){
        if (head ==null){
            System.out.println("Empty List");
            return null;


        }

        if(head==tail){ //solve for one Element list 
            Node temp=head;
            head=tail=null;
            System.out.println(temp.value+ " Deleted");
            return temp;

        }

        Node n=head;
        while(n.next!=null){
            tail=n;
            n=n.next;
        }
        Node temp=n;//to be deleted 
        tail.next=null;
        n=null;
        length--;
        System.out.println(temp.value + "Deleted ");
        return temp;

    }

    public void delete(T value){
        if(isEmpty()){
            return;
        }

        Node current=head;
        Node prev=current;

        while(current.value!=value){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        current.next=null;

        
    }

    public Node getMiddleNode(){

        if (isEmpty()){
            return null;
        }
        
        Node current =head;
        Node prev = current;
        int c=1;
        while(current!=null){
            if(c%2==0)
                prev=prev.next;
               
                
            current=current.next;
            c++;
            
        }

        return prev;
    }
    public int search (T value ){
        int index=0;
        if (isEmpty()){
            System.out.println("Empty List");
            return -1;
        }
        Node n = head ;
        while (n!=null){

            if(n.value==value){
                break;
            }
            index++;
            n=n.next;
        }


        

        return n!=null? index:-1;

    }

    public void printReverse(Node head ){

        if (head == null)
            return ;
        
        //this prints list in reverse 
        //but dosnt reverse the list structure 
        printReverse(head.next);
        System.out.println(head.value);
        

    }

    /**
     * Recursive method to inverse the LinkedList
     * it first moves the tail to the beggining on the first call where the 
     * current Node is the head Node then 
     * once the recursion reaches the base code where the next node is null
     * it assignes the new head of the List to the previous Node (Which is the End of the Original List)
     * @param current
     * @param prev
     * @return Node : the Node that preceedes the current Node in each iteration
     */
    public Node reverseByRecursion(Node current,Node prev){

        //moves the tail to the beginnering on the first call
        if(head == current ){
            tail=head;
        }
        if(current==null){
            head=prev;
            return prev;
        }
        
        reverseByRecursion(current.next,current).next=prev;
        return prev;

    }
    

    public void reverse(){
        if (isEmpty())
            return;

        Node curr=head;
        Node prev=null;
        Node nextNode=curr.next;

        while(nextNode!=null){
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            nextNode=nextNode.next;
        }

        curr.next=prev;
        head=curr;
    }



    public void addAt(int index,T value){
      if(index<0 || index >=length ){
        System.out.println("Out of range");
        return;
      }

      if(isEmpty()){
            System.out.println("Empty List!\n add at index 0 ");
            add(value);
            return ;
    }
    
    int c =0;
    Node n = head ;
    Node newNode = new Node(value, null);
    while(c<index-1){
        c++;
        n=n.next;
    }
    if (c==0)  {
        newNode.next=head;
        head=newNode;
    }
    else {
        newNode.next=n.next;
        n.next=newNode;

    }





    }

    public void display(){
        Node n = head;
        while (n!=null){
            System.out.println(n.value);
            n=n.next;

        }
    }
    public boolean isEmpty(){
        return head==null;
    }

}
