package Queue;

import java.util.Arrays;

public class Queue {
    
    int head ;
    int rear ;
    int size ;
    int [] arr;
    public Queue(int size){
        this.size=size;
        head=rear=-1;
        arr =  new int[size];
    }


    public int push (int e){

        if (head ==-1){
            arr[0]=e;
            head=0;
            rear=0;

            return e;
        }
        if(rear==size-1){
            System.out.println("Queue is Full 5 is the size");
            return size;

        }
        arr[++rear]=e;
        return e;
    }

    public int pop(){

        if (head ==-1){
            System.out.println("empty queue!");
            return -1;
        }
        
        int temp =arr[head];
        head ++;
        if(head>rear)
            head=rear=-1;
        
        return temp;

    }

    public int getHead(){
        return head;
    }

    public int getRear(){
        return rear;
    }

    public void display(){
        
            if(head==-1){
                System.out.println("Empty Queue!");
                return;
            }

            for (int i=rear ;i>=head;i--){
                System.out.print(arr[i]+" ");
                
            }
            System.out.println();
    

    }
}
