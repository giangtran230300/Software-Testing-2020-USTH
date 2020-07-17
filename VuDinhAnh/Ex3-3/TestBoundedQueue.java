import org.junit.Test;

import static org.junit.Assert.*;

public class TestBoundedQueue {
    @Test
    public void test_isEmpty()
    {
        BoundedQueue bq0 = new BoundedQueue(0);
        assertTrue(bq0.isEmpty());
        BoundedQueue bq1 = new BoundedQueue(1);
        bq1.enQueue(1);
        assertFalse(bq1.isEmpty());
    }

    @Test
    public void test_isFull()
    {
        BoundedQueue bq0 = new BoundedQueue(2);
        bq0.enQueue(1);
        assertFalse(bq0.isFull());
        bq0.enQueue(2);
        assertTrue(bq0.isFull());
    }

    @Test
    public void test_toString()
    {
        BoundedQueue bq0 = new BoundedQueue(3);
        bq0.enQueue(1);
        bq0.enQueue(2);
        bq0.enQueue(3);
        assertEquals(bq0.toString(), "[1, 2, 3]");
        bq0.deQueue();
        bq0.deQueue();
        bq0.deQueue();
        assertEquals(bq0.toString(), "[]");
    }
}
