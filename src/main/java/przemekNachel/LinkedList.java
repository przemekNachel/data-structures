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
        return (T) getNode(index).getValue();
    }

    public void remove(int index) {
        if (index > 0) {
            Node previous = getNode(index - 1);
            for (;index < maxIndex; index++) previous.setNext(previous.getNext().getNext());

            previous.getNext().setNext(null);
            tail = previous;

        } else {
            head = head.getNext();
            for (;index < maxIndex; index++) {
                Node current = head;
                current.getNext().setNext(current.getNext().getNext());
            }

        }
        maxIndex--;



    }

    private Node getNode(int index) {
        if(index > maxIndex) throw new IndexOutOfBoundsException();
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

}
