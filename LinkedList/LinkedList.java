package LinkedList;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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
