package przemekNachel;

class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int maxIndex= -1;

    void add(T value) {
        if (head == null) {
            head = new Node<>(value);
            tail = head;
        } else {
            tail.setNext(new Node<>(value));
            tail = tail.getNext();
        }
        maxIndex++;
    }

    T get(int index) {
        return getNode(index).getValue();
    }

    void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            maxIndex--;
            tail = getNode(maxIndex);
            tail.setNext(null);
        } else {
            Node<T> previous = getNode(index - 1);
            previous.setNext(previous.getNext().getNext());
            maxIndex--;
            for(; index < maxIndex; index++) previous = previous.getNext();
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
