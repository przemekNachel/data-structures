package przemekNachel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyDynamicArrayTest {

    private MyDynamicArray<String> myDynamicArray;

    @Before
    public void setup() {
        myDynamicArray = new MyDynamicArray<>();
    }

    @Test
    public void test_addAndGetOneElement() {
        myDynamicArray.add("Hello");

        Assert.assertEquals("Hello", myDynamicArray.get(0));
        Assert.assertEquals("Hello", myDynamicArray.get(0));
    }

    @Test
    public void test_addAndGetManyElements() {
        for (int i = 0; i < 5000; i++) myDynamicArray.add(String.valueOf(i));
        for (int i = 0; i < 5000; i++) {
            int random = (int) (Math.random() * 5000);
            Assert.assertEquals(random, Integer.parseInt(myDynamicArray.get(random)));
        }
    }

    @Test
    public void test_removeOneElement() {
        myDynamicArray.add("Hello");
        myDynamicArray.add("World");

        myDynamicArray.remove(0);

        Assert.assertEquals("World", myDynamicArray.get(0));
    }
}
