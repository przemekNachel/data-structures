package przemekNachel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MyQueueTest {

    private MyQueue<String> myQueue;
    
    @Before
    public void setup() {
        myQueue = new MyQueue<>();
    }

    @Test
    public void test_enqueueAndPeek() {
        myQueue.enqueue("Hello");

        Assert.assertEquals("Hello", myQueue.peek());
    }

    @Test
    public void test_enqueueAndDequeueTwice() {
        myQueue.enqueue("Hello");
        myQueue.enqueue("World");

        Assert.assertEquals(2, myQueue.size());
        Assert.assertEquals("Hello", myQueue.dequeue());
        Assert.assertEquals("World", myQueue.dequeue());
        Assert.assertTrue(myQueue.isEmpty());
    }

    @Test
    public void test_enqueueAndDequeueManyTimes() {
        myQueue.enqueue("Hello");
        myQueue.enqueue("World");
        myQueue.enqueue("My");
        myQueue.enqueue("Home");

        Assert.assertEquals(4, myQueue.size());
        Assert.assertFalse(myQueue.isEmpty());
        Assert.assertEquals("Hello", myQueue.dequeue());
        Assert.assertEquals("World", myQueue.dequeue());
        Assert.assertEquals("My", myQueue.dequeue());
        Assert.assertEquals("Home", myQueue.dequeue());
        Assert.assertTrue(myQueue.isEmpty());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_dequeueEmpty() {
        myQueue.dequeue();
    }

    @Test (expected = NoSuchElementException.class)
    public void test_dequeueEmpty2() {
        myQueue.peek();
    }
}
