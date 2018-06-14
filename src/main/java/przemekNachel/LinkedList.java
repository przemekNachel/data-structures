package przemekNachel;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int maxIndex= -1;

    public void append(T value) {
            if (head == null) {
                head = new Node<T>(value);
                tail = head;
                maxIndex++;
            } else {
                tail.setNext(new Node<T>(value));
                tail = tail.getNext();
                maxIndex++;
            }
    }

    public T get(int index) {
        if(index > maxIndex) throw new IndexOutOfBoundsException();
        T value = head.getValue();
        Node current = head;
        for(int i = 0; i <= index; i++) {
            value = (T) current.getValue();
            current = current.getNext();
        }
        return value;
    }
}
