package przemekNachel;

public class MyStack<T> {

    private T[] array;
    private int topIndex = -1;

    public MyStack(int size) {
        array = (T[]) new Object[size];
    }

    public void push(T element) {
        array[++topIndex] = element;
    }

    public T peek() {
        return array[topIndex];
    }

    public T pop() {
        T element = array[topIndex];
        array[topIndex--] = null;
        return element;
    }

    public int size() {
        return array.length;
    }

    public int space() {
        return array.length - topIndex - 1;
    }
}
