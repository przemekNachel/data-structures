package przemekNachel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class MyMyLinkedListTest {
    
    private MyLinkedList<Integer> list;
    
    @Before
    public void setup() {
        list = new MyLinkedList<>();
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

    @Test
    public void test_addRemoveAndGetRandomValues() {
        LinkedList<Integer> expected = new LinkedList<>();
        for (int i = 0; i < 5000; i++) {
            expected.add(i);
            list.append(i);
        }
        int[] removed = new int[2500];
        int max = 5000;
        for (int i = 0; i < 2500; i++) {
            int random = 2;
            while (Arrays.asList(removed).contains(random)) random = (int) (Math.random() * max);
            list.remove(random);
            expected.remove(random);
            removed[i] = random;
            max--;
        }
        Integer[] expectedArray = new Integer[2500];
        for (int i = 0; i < 2500; i++) expectedArray[i] = expected.get(i);
        Integer[] myLinkedListArray = new Integer[2500];
        for (int i = 0; i < 2500; i++) myLinkedListArray[i] = list.get(i);
        Assert.assertArrayEquals(expectedArray, myLinkedListArray);
    }
}
