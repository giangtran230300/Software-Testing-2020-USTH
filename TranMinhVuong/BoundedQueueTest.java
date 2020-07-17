/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
/**
 *
 * @author oOo
 */
public class BoundedQueueTest {
    int capacity;
    public BoundedQueueTest() {
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    
    }
    
        

    /**
     * Test of enQueue method, of class BoundedQueue.
     */
    
    
    @Test
    public void testEnQueue() {
        Object o = new Object();
        BoundedQueue instance = new BoundedQueue(1);
        instance.enQueue(o);
        assertFalse(instance.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expected = NullPointerException.class)
    public void testEnQueue2(){
        Object o = null;
        BoundedQueue instance = new BoundedQueue(1);
        instance.enQueue(o);
    }
    @Test(expected = IllegalStateException.class)
    public void testEnQueue3(){
        Object o = new Object();
        BoundedQueue instance = new BoundedQueue(0);
        instance.enQueue(o);
    }
    @Test(expected = IllegalStateException.class)
    public void testEnQueue4(){
        Object o = new Object();
        BoundedQueue instance = new BoundedQueue(1);
        instance.enQueue(o);
        instance.enQueue(o);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstruct(){
        BoundedQueue instance = new BoundedQueue(-1);
    }
    
    /**
     * Test of deQueue method, of class BoundedQueue.
     */
    @Test
    public void testDeQueue() {
        System.out.println("deQueue");
        BoundedQueue instance = new BoundedQueue(1);
        Object obj = new Object();
        instance.enQueue(obj);
        Object result = instance.deQueue();
        assertEquals(obj, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class BoundedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BoundedQueue instance = new BoundedQueue(0);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class BoundedQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        BoundedQueue instance = new BoundedQueue(1);
        Object obj = new Object();
        instance.enQueue(obj);
        boolean expResult = true;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class BoundedQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BoundedQueue instance = new BoundedQueue(2);
        String ob2 = "Result";
        String ob1 = "Expected";
        instance.enQueue(ob1);
        instance.enQueue(ob2);
        String expResult = "[Expected, Result]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
