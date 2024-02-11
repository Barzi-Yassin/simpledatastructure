package linear.linkedlist.singly;

import general.Functions;

public class SinglyLinkedList<T> extends Functions {
    Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // starting primary methods
    public void insertFront(T newData) {
        Node<T> newNode = new Node<>(newData);
        if (isHeadNull()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        plSpace("insertFront: " + newData);
        print();
    }

    public void insertRear(T newData) {
        Node<T> newNode = new Node<>(newData);
        if (isHeadNull()) {
            head = newNode;
        } else {
            Node<T> current = head; // backuping head
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        plSpace("insertRear: " + newData);
        print();
    }

    public void deleteFront() {
        if (isHeadNull()) {
            plSpace("the LinkedList is empty, deleteFront canceled.");
        } else {
            plSpace("deleteFront: " + head.data);
            head = head.next;
        }
        print();
    }

    public void deleteRear() {
        if (isHeadNull()) {
            plSpace("the LinkedList is empty, deleteRear canceled.");
        } else {
            Node<T> current = head; // backuping head
            while (current.next.next != null)
                current = current.next;
            plSpace("deleteRear: " + current.next.data);
            current.next = null;
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
        plSpace("SinglyLinkedList: " + output + " | length: " + length());
        return output;
    }

    public SinglyLinkedList<Integer> search(final int numToFind) {
        SinglyLinkedList<Integer> result = new SinglyLinkedList<>();
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

    // starting optional methods
    private boolean isHeadNull() {
        return head == null;
    }


}
