package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {
    @Test
    public void testEnQueue() {
        Object o = 100;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o);
        assertEquals(instance.toString(), "[100]");
    }

    @Test
    public void testDeQueue() {
        Object o1 = 100;
        Object o2 = 200;
        BoundedQueue instance = new BoundedQueue(5);
        instance.enQueue(o1);
        instance.enQueue(o2);
        instance.deQueue();
        assertEquals(instance.toString(), "[200]");
    }

    @Test
    public void testIsEmpty() {
        BoundedQueue instance = new BoundedQueue(5);
        assertEquals(instance.isEmpty(), true);
    }

    @Test
    public void testIsFull() {
        Object o1 = 100;
        Object o2 = 200;
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue(o1);
        instance.enQueue(o2);
        assertEquals(instance.isFull(), true);
    }

    @Test
    public void testToString() {
        Object o1 = 100;
        Object o2 = 200;
        BoundedQueue instance = new BoundedQueue(10);
        instance.enQueue(o1);
        instance.enQueue(o2);
        assertEquals(instance.toString(), "[100, 200]");
    }
}

