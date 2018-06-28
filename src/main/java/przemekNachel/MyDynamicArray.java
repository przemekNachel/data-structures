package przemekNachel;

public class MyDynamicArray<T> {

    T[] array;
    int maxIndex = -1;

    public MyDynamicArray() {
        array = (T[]) new Object[5];
    }

    public void add(T element) {
        tryIncreaseSize();
        array[++maxIndex] = element;
    }

    private void tryIncreaseSize() {
        if(maxIndex == array.length - 1) {
            T[] temp = (T[]) new Object[array.length];
            for (int i = 0; i < array.length; i++) temp[i] = array[i];
            array = (T[]) new Object[array.length * 2];
            for (int i = 0; i < temp.length; i++) array[i] = temp[i];
        }
    }

    public T get(int i) {
        return array[i];
    }
}
