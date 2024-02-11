package linear.linkedlist.doubly;

import general.Functions;

public class DoublyLinkedList<T> extends Functions {
    Node<T> head;
    Node<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // starting primary methods
    public void insertFront(final T newData) {
        Node<T> newNode = new Node<>(newData);
        if (isHeadNull()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        plSpace("insertFront: " + newData);
        print();
    }

    public void insertRear(final T newData) {
        Node<T> newNode = new Node<>(newData);
        if (isTailNull()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        plSpace("insertRear: " + newData);
        print();
    }

    public void deleteFront() {
        if (isHeadNull()) {
            plSpace("the LinkedList is empty, deleteFront canceled.");
        } else {
            plSpace("deleteFront: " + head.data);
            head.next.prev = null;
            head = head.next;
        }
        print();
    }

    public void deleteRear() {
        if (isTailNull()) {
            plSpace("the LinkedList is empty, deleteRear canceled.");
        } else {
            plSpace("deleteRear: " + tail.data);
            tail.prev.next = null;
        }
        print();
    }


    // starting operationAt index methods
    public void insertAt(final int insertingIndex, final T newData) {
        if (insertingIndex >= 0 && insertingIndex <= length()) {
            if (insertingIndex == 0) insertFront(newData);
            else if (insertingIndex == length()) insertRear(newData);
            else {
                Node<T> newNode = new Node<>(newData);
                Node<T> current = head;
                int i = 1;
                while (current != null) {
                    if (i == insertingIndex) {
                        newNode.next = current.next;
                        newNode.next.prev = newNode;
                        newNode.prev = current;
                        current.next = newNode;
                        plSpace(newData + " is inserted at index: " + insertingIndex);
                        break;
                    }
                    i++;
                    current = current.next;
                }
                print();
            }
        } else {
            plSpace("inserting index is not allowed (out of range), insertAt canceled.");
        }
    }

    public void deleteAt(final int deletingIndex) {
        if (deletingIndex >= 0 && deletingIndex <= length()) {
            if (deletingIndex == 0) deleteFront();
            else if (deletingIndex == length()) deleteRear();
            else {
                Node<T> tempNode = null;
                Node<T> current = head;
                int i = 1;
                while (current != null) {
                    if (i == deletingIndex) {
                        plSpace(" • " + current.next.data + " is deleted at index: " + deletingIndex);
                        current.next = current.next.next;
                        current.next.prev = current;
                        break;
                    }
                    i++;
                    current = current.next;
                }
                print();
            }
        } else {
            plSpace("deleting index is not allowed (out of range), deleteAt canceled.");
        }
    }

    // starting secondary methods
    public String print() {
        String output = "[";

        if (isHeadNull()) {
            output += "]";
        } else {
            Node<T> current = head; // backuping head
            while (current != null) {
                output += current.data + ", ";
                current = current.next;
            }
            output += "\b\b]";
        }
        plSpace("DoublyLinkedList: " + output + " | length: " + length());
        return output;
    }

    public String printReverse() {
        String output = "[";

        if (isHeadNull()) {
            output += "]";
        } else {
            Node<T> current = tail; // backuping tail
            while (current != null) {
                output += current.data + ", ";
                current = current.prev;
            }
            output += "\b\b]";
        }
        plSpace("DoublyLinkedList in reverse: " + output + " | length: " + lengthReverse());
        return output;
    }

    public DoublyLinkedList<Integer> search(final int numToFind) {
        DoublyLinkedList<Integer> result = new DoublyLinkedList<>();
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            if (current.data.equals(numToFind))
                result.insertRear(i);
            current = current.next;
            i++;
        }

        // showing result
        pSpace("Search result, number " + numToFind);
        if (result.length() == 0)
            p(" not found.");
        else {
            p(" found at these indices: ");
            result.print();
        }

        return result;
    }

    public int length() {
        int length = 0;
        if (!isHeadNull()) {
            Node<T> current = head; // backuping head
            while (current != null) {
                length++;
                current = current.next;
            }
        }
        return length;
    }

    public int lengthReverse() {
        int length = 0;
        if (!isTailNull()) {
            Node<T> current = tail; // backuping tail
            while (current != null) {
                length++;
                current = current.prev;
            }
        }
        return length;
    }

    // starting optional methods
    private boolean isHeadNull() {
        return head == null;
    }

    private boolean isTailNull() {
        return tail == null;
    }


}
