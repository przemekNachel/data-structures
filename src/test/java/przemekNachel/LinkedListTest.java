package przemekNachel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    
    private LinkedList<Integer> list;
    
    @Before
    public void setup() {
        list = new LinkedList<>();
    }

    @Test
    public void test_addValue() {
        list.append(1);
    }

    @Test
    public void test_getValue() {
        list.append(1);
        Assert.assertEquals(new Integer(1), list.get(0));
    }

    @Test
    public void test_get3Values() {
        list.append(0);
        list.append(1);
        list.append(2);
        Integer[] expected = {0, 1, 2};
        Integer[] ints = {list.get(0), list.get(1), list.get(2)};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void test_get2ValuesAfterRemove() {
        list.append(0);
        list.append(1);
        list.append(2);
        list.remove(0);
        Integer[] expected = {1, 2};
        Integer[] ints = {list.get(0), list.get(1)};
        Assert.assertArrayEquals(expected, ints);
    }
}
