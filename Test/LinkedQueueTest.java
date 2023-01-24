package Test;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import Queue.LinkedQueue;


public class LinkedQueueTest {

    /**
     * Test Push method for different Generic Types 
     */
    @Test 
    public void PushTest(){
        
        
        LinkedQueue<String> q1 = new LinkedQueue<>();
        assertEquals("Mohammad", q1.push("Mohammad")); 
        
        LinkedQueue<Integer> q2 = new LinkedQueue<>();
        for (int i=0;i<50;i++)
            assertEquals(Integer.valueOf(i), q2.push(i));
        

        LinkedQueue<String> q3 = new LinkedQueue<>();
        assertEquals(null,q3.Pop());

        q3.push("Mohammad");
        assertEquals(null,q3.Pop());


    }
    
}
