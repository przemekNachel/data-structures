package przemekNachel;

import org.junit.Before;
import org.junit.Test;

public class BSTTest {

    private BST bst;
    private static final int AMOUNT = 100;

    @Before
    public void setup() {
        bst = new BST();
    }

    @Test
    public void test_add() {
        int[] array = new int[AMOUNT];
        for (int i = 0; i < AMOUNT; i++) array[i] = (int) (Math.random() * 100);
        for (int i : array) bst.add(i);
        bst.print();
    }
}
