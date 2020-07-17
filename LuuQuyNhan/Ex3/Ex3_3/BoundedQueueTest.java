package Ex3.Ex3_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoundedQueueTest {
    private BoundedQueue queue;

    @BeforeEach
    public void setUp() {
        this.queue = new BoundedQueue(3);
    }

    @Test
    public void testEmptyQueue() {
        Assertions.assertTrue(this.queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        String newElement = "New element";
        this.queue.enQueue(newElement);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        String newElement = "New element";
        this.queue.enQueue(newElement);
        Assertions.assertEquals(newElement, this.queue.deQueue());
    }

    @Test
    public void testFullQueue() {
        String test1, test2, test3;
        test1 = "1";
        test2 = "2";
        test3 = "3";

        this.queue.enQueue(test1);
        this.queue.enQueue(test2);
        Assertions.assertFalse(this.queue.isFull());

        this.queue.enQueue(test3);
        Assertions.assertTrue(this.queue.isFull());
    }

    @Test
    public void testToString() {
        String test1, test2, test3;
        test1 = "1";
        test2 = "2";
        test3 = "3";

        this.queue.enQueue(test1);
        this.queue.enQueue(test2);
        this.queue.enQueue(test3);

        Assertions.assertEquals("[1, 2, 3]", this.queue.toString());
    }
}