package linear.linkedlist.doubly;

public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T newData) {
        this.data = newData;
        this.next = null;
        this.prev = null;
    }
}
