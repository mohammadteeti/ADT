package Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Circular Queue adds elements and deletes them in a 
 * circular way ,that if an element is to be add and the
 * rear reaches maximum then it starts again from the begenign
 * 
 */
public class CircularQueueGeneric<T> {

    List<T> list= new ArrayList<>(); // as we connot initiate a generic array directly in java
    T [] arr;
    int front,rear;
    int length;
    int count;

    /*
    *Using Array List here solves for both generic arrays in java
     * and for dynamic size array as a Queue
     * Length here is not mainly needed for size feature
     * but it may be needed to put a constraint on the Enqueue
     * operation , as it limits the number of allowed elements to be 
     * inserted 
     * hwoever it must be carefully checked in the enqueue and dequeue
     * methods for the right logical operations
     * 
     */
    public CircularQueueGeneric(int length){

        this.length=length;
        this.front=0;
        this.rear=length-1;
        this.count=0;
        this.arr = (T [])list.toArray(); //safer than casting the object array to T generic Type 

    }

    //to be implemented later 
    public void enqueue(T value){
            if(isFull()){
                System.out.println("Full Queue!");
                return ;
            }
            
            rear=(rear+1)%length;// exploit modulus approach in creating circular feature
            //arr.a
            
    }

    public boolean isFull(){

        return count==length;
    }

    public boolean isEmpty(){
        return count==0;
    }



    
    
}
