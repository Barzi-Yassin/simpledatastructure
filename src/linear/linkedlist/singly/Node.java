package linear.linkedlist.singly;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T newData){
        this.data = newData;
        this.next = null;
    }
}
