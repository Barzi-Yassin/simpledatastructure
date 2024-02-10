package linear.queue;

import general.Functions;

@SuppressWarnings("unchecked")
public class Queue<T> extends Functions {
    private T[] queue;
    private int numOfItems;
    private int front;
    private int rear;
    private final int DEFAULT_SIZE = 4;

    // starting constructor methods
    public Queue() {
        initQueue(DEFAULT_SIZE);
    }

    public Queue(final int size) {
        if (size >= 0) {
            initQueue(size);
        } else {
            pl("the queue size is set to default size: '" + DEFAULT_SIZE + "'");
            initQueue(DEFAULT_SIZE);
        }
    }

    private void initQueue(final int size) {
        queue = (T[]) new Object[size];
        numOfItems = 0;
        front = 0;
        rear = 0;
    }

    // starting primary methods
    public void enQueue(final T newData) {
        if (isFull()) {
            plSpace("the queue is full, enQueue canceled.");
        } else {
            queue[rear] = newData;
            rear = ++rear % length();
            numOfItems++;
        }
        print();
    }

    public T deQueue() {
        T temp = null;
        if (isEmpty()) {
            plSpace("the queue is empty, deQueue canceled.");
        } else {
            temp = queue[front];
            front = ++front % length();
            numOfItems--;
        }
        print();
        return temp;
    }

    public String print() {
        String output = "[";
        if (isEmpty()) {
            output += "]";
        } else {
            for (int i = 0; i < numOfItems; i++) {
                output += queue[(front + i) % length()] + ", ";
            }
            output += "\b\b]";
        }
        plSpace("queue: "+output);
        return output;
    }

    public int count(){
        return numOfItems; // test it bro from the main method
    }

    // starting secondary methods
    private boolean isEmpty() {
        return numOfItems == 0;
    }

    private boolean isFull() {
        return numOfItems == length();
    }

    // starting optional methods
    private int length() {
        return queue.length;
    }
}
