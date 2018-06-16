package przemekNachel;

public class Node<T> {

    private T value;
    private Node next;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
