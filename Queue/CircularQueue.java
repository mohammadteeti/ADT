package Queue;


/**
 * Integer Type Circular Queue 
 * @author Mohammad J Teeti
 * @version 1.1
 * 
 * ADT uses integer array which is dynamically created
 * on object instantiation 
 * 
 */
public class CircularQueue {

    int front,rear,length,count;
    int []  arr ;
    

    public CircularQueue(int size){
        front=0;
        length=size;
        rear=length-1;
        arr=new int[length];
        count=0;
    }

    /**
     * add new value to the rear of the Queue
     * exploit the idea of Modulus to implement the 
     * circulation , once the rear pointer reaches the end
     * it returns to 0-index
     * {@code count} is increased at every increment 
     * {@code count} is used to test for Queue state , full or empty 
     * @param value
     */
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full!");
            return;

        }

        //using modulus equation to create circular approch
        rear=(rear+1)%length;
        arr[rear]=value;
        count++;


    }

    /**
     * returns the front value and removes it from the queue
     * @return value : the integer value on the front of the Queue
     */
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }

        int value = arr[front];
        front=(front+1)%length; 
        count--;

        return value;

    }

    /**
     * prints all queue vvalues 
     * it takes the cirulation  into consodration  
     */
    public void display (){
        for (int i = front;i!=rear;i=(i+1)%length){
            System.out.println(arr[i]);
        }
        System.out.println(arr[rear]);// print element where i==rear
    }

    /**
     * 
     * @return true if Queue is Empty ,false otherwise
     */
     public boolean isEmpty(){
        return  count==0;
     }

    /**
     * 
     * @return true if Queue is Full ,false otherwise
     */
     public boolean isFull(){
        return  count==length;
     }

}
