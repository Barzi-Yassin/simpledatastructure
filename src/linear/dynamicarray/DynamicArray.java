package linear.dynamicarray;

import general.Functions;

public class DynamicArray<T> extends Functions {

    private final int DEFAULT_SIZE = 1; // having a default size, the array length won't be less than it.
    private T[] array;
    private int numOfItems;

    // starting constructor methods
    public DynamicArray() {
        initArray(DEFAULT_SIZE);
    }

    public DynamicArray(final int size) {
        if (size >= 0) {
            initArray(size);
        } else {
            pl("the array size is to default size '" + DEFAULT_SIZE + "'");
            initArray(DEFAULT_SIZE);
        }
    }

    private void initArray(final int size) {
        array = (T[]) new Object[size];
    }

    // starting primary methods
    public void add(final T newData) {
//        pl("# add");
        if (numOfItems == length())
            grow();
        array[numOfItems++] = newData;
        plSpace(newData + " is added");
        print(false);
    }

    public void delete() {
        if (numOfItems == 0) {
            plSpace("the array is already empty, delete canceled.");
        } else {
            plSpace(array[--numOfItems] + " is deleted");
            if (numOfItems <= (length() / 2) && length() != DEFAULT_SIZE) // will shrink till length > 1
                shrink();
        }
        print(false);
    }

    public void print(final boolean withDetail) {
        String output = "[";
        if (numOfItems == 0) {
            output += "]";
        } else {
            for (int i = 0; i < numOfItems; i++) {
                output += array[i] + ", ";
            }
            output += "\b\b]";
        }
        pSpace("array: " + output);
        if (withDetail)
            pl(" | length: " + length() + " | numOfItems: " + numOfItems);
        else
            pl("");

    }

    public DynamicArray search(final int numToFind) {
        DynamicArray<Integer> indices = new DynamicArray<>();
        for (int i = 0; i < numOfItems; i++) {
            if (array[i].equals(numToFind)) {
                indices.add((Integer) i);
            }
        }

        // showing result
        pSpace("Search result, number " + numToFind);
        if (indices.count() == 0)
            p(" not found.");
        else {
            p(" found at these indices: ");
            indices.print(false);
        }
        return indices;
    }

    public int count() {
        return numOfItems;
    }

    // starting secondary methods
    private void grow() {
        T[] temp = (T[]) new Object[length() * 2];
        for (int i = 0; i < length(); i++)
            temp[i] = array[i];
        array = temp;
        plSpace("• array length was grown, to: " + length());
    }

    private void shrink() {
        T[] temp = (T[]) new Object[(length() / 2)];
        for (int i = 0; i < (length() / 2); i++)
            temp[i] = array[i];
        array = temp;
        plSpace("• array length was shrank, to: " + length());
    }

    // starting optional methods
    private int length() {
        return array.length;
    }
}
