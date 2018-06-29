package przemekNachel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

    private MyStack<String> myStack;

    @Before
    public void setup() {
        myStack = new MyStack<>(10);
    }

    @Test
    public void test_pushAndPeek() {
        myStack.push("Hello");

        Assert.assertEquals("Hello", myStack.peek());
    }
}
