package stack;

import general.Functions;

public class Stack<T> extends Functions {
    private T[] stack;
    private int top;
    private final int DEFAULT_SIZE = 4;

    public Stack() {
        stack = (T[]) new Object[DEFAULT_SIZE];
        top = 0;
    }

    // starting primary methods
    public void push(final T newData) {
        if (top == length()) {
            plSpace("the stack is full, push canceled.");
        } else {
            stack[top++] = newData;
        }
        print();
    }

    public T pop() {
        T willBePopped = null;
        if (top == 0) {
            plSpace("the stack is already empty, pop canceled.");
        } else {
            willBePopped = stack[--top];
        }
        print();
        return willBePopped;
    }

    public T peek() {
        T willBePeeked = null;
        if (top == 0) {
            plSpace("the stack is empty, peek canceled.");
        } else {
            willBePeeked = stack[(top-1)];
        }
        print();
        return willBePeeked;
    }

    public int count() {
        return top;
    }

    public String print() {
        String output = "stack: [";
        if (top == 0) {
            output += "]";
        } else {
            for (int i = 0; i < top; i++) {
                output += stack[i] + ", ";
            }
            output += "\b\b]";
        }
        plSpace(output);
        return output;
    }

    // starting optional methods
    private int length() {
        return stack.length;
    }
}
