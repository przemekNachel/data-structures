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

    @Test
    public void test_pushAndPop() {
        myStack.push("Hello");
        myStack.push("World");
        Assert.assertEquals("World", myStack.pop());
        Assert.assertEquals("Hello", myStack.pop());
    }

    @Test
    public void test_getSizeAndFreeSpaces() {
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        Assert.assertEquals(10, myStack.size());
        Assert.assertEquals(7, myStack.space());
    }
}
