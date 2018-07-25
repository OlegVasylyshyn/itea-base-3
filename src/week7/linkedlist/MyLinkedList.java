package week7.linkedlist;

public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    private int size;

    public void add(T value) {
        if(size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }

        Node<T> tNode = new Node<>(null, last, value);
        last.next = tNode;
        last = tNode;
        size++;
    }

    private class Node<T> {

        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }

}
