package przemekNachel;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int maxIndex= -1;

    public void append(T value) {
        if (head == null) {
            head = new Node<T>(value);
            tail = head;
        } else {
            tail.setNext(new Node<T>(value));
            tail = tail.getNext();
        }
        maxIndex++;
    }

    public T get(int index) {
        return (T) getNode(index).getValue();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            maxIndex--;
            tail = getNode(maxIndex);
            tail.setNext(null);
        } else {
            Node<T> previous = getNode(index - 1);
            previous.setNext(previous.getNext().getNext());
            maxIndex--;
            for(int i = index; index < maxIndex; index++) previous = previous.getNext();
            tail = previous.getNext();
            tail.setNext(null);
        }
    }

    private Node<T> getNode(int index) {
        if(index > maxIndex || index < 0) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

}
