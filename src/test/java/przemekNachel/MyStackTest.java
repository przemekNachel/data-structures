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

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_stackOverflow() {
        for (int i = 0; i < 11; i ++) {
            myStack.push("1");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_stackUnderflow() {
        myStack.push("1");
        myStack.pop();
        myStack.pop();
    }
}
