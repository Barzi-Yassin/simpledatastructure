import general.Functions;
import linear.linkedlist.doubly.DoublyLinkedList;
import linear.linkedlist.singly.SinglyLinkedList;

public class Main extends Functions {
    public static void main(String[] args) {
        pl("<Programmed by: Barzi Yassin Karim>\n");
//        runDynamicArray();
//        runStack();
//        runQueue();
//        runSinglyLinkedList();
        runDoublyLinkedList();
    }

    private static void runDoublyLinkedList() {
        pl("• • • DoublyLinkedList Program • • •");
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        pl("\nMenu:");
        pl("------------------");
        plSpace("1. insertFront");
        plSpace("2. insertRear");
        plSpace("3. deleteFront");
        plSpace("4. deleteRear");
        plSpace("5. insertAt");
        plSpace("6. deleteAt");
        plSpace("7. Count");
        plSpace("8. Print");
        plSpace("9. Print in reverse");
        plSpace("10. Search");
        plSpace("11. Fill list with 10 random numbers");
        plSpace("0. Exit");

        scInit();
        rnInit();

        for (int i = 0; i < 10; i++)
            dll.insertRear(i);
//            dll.insertRear(getRandomNumber(5));
        pl("\n");

        dll.print();
        dll.printReverse();


        int cycle = 0;
        while (true) {

            pSpace("\n " + ++cycle + "• Enter your option: ");
            int sllOption = inputInt();
            int valueToInsert;
            switch (sllOption) {
                case 1:
                    plSpace("insertFront;");
                    pSpace("Enter value to insertFront: ");
                    valueToInsert = inputInt();
                    dll.insertFront(valueToInsert);
                    break;

                case 2:
                    plSpace("insertRear;");
                    pSpace("Enter value to insertRear: ");
                    valueToInsert = inputInt();
                    dll.insertRear(valueToInsert);
                    break;

                case 3:
                    plSpace("deleteFront;");
                    dll.deleteFront();
                    break;

                case 4:
                    plSpace("deleteRear;");
                    dll.deleteRear();
                    break;

                case 5:
                    plSpace("insertAt;");
                    pSpace("Enter index: ");
                    int indexToInsert = inputInt();
                    pSpace("Enter value: ");
                    valueToInsert = inputInt();
                    dll.insertAt(indexToInsert, valueToInsert);
                    break;

                case 6:
                    plSpace("deleteAt;");
                    pSpace("Enter index: ");
                    int indexToDelete = inputInt();
                    dll.deleteAt(indexToDelete);
                    break;

                case 7:
                    plSpace("Count: " + dll.length());
                    break;

                case 8:
                    dll.print();
                    break;

                case 9:
                    dll.printReverse();
                    break;

                case 10:
                    pSpace("Enter number to find: ");
                    final int numToFind = inputInt();
                    dll.search(numToFind);
                    break;

                case 11:
                    for (int i = 0; i < 10; i++)
                        dll.insertRear(getRandomNumber(5));
                    break;

                case 0:
                    plSpace("</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                    break;

                default:
                    plSpace("Invalid option. Try again.");
                    break;
            }
            pl("\n  # ");
        }

    }


    /*private static void runSinglyLinkedList() {
        pl("• • • SinglyLinkedList Program • • •");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

//        sll.print();
//        sll.insertFront(23);

        pl("\nMenu:");
        pl("------------------");
        plSpace("1. insertFront");
        plSpace("2. insertRear");
        plSpace("3. deleteFront");
        plSpace("4. deleteRear");
        plSpace("5. insertAt");
        plSpace("6. deleteAt");
        plSpace("7. Count");
        plSpace("8. Print");
        plSpace("9. Search");
        plSpace("10. Fill list with 10 random numbers");
        plSpace("0. Exit");


        scInit();
        rnInit();
        int cycle = 0;
        while (true) {

            pSpace("\n " + ++cycle + "• Enter your option: ");
            int sllOption = inputInt();
            int valueToInsert;
            switch (sllOption) {
                case 1:
                    plSpace("insertFront;");
                    pSpace("Enter value to insertFront: ");
                    valueToInsert = inputInt();
                    sll.insertFront(valueToInsert);
                    break;

                case 2:
                    plSpace("insertRear;");
                    pSpace("Enter value to insertRear: ");
                    valueToInsert = inputInt();
                    sll.insertRear(valueToInsert);
                    break;

                case 3:
                    plSpace("deleteFront;");
                    sll.deleteFront();
                    break;

                case 4:
                    plSpace("deleteRear;");
                    sll.deleteRear();
                    break;

                case 5:
                    plSpace("insertAt;");
                    pSpace("Enter index: ");
                    int indexToInsert = inputInt();
                    pSpace("Enter value: ");
                    valueToInsert = inputInt();
                    sll.insertAt(indexToInsert, valueToInsert);
                    break;

                case 6:
                    plSpace("deleteAt;");
                    pSpace("Enter index: ");
                    int indexToDelete = inputInt();
                    sll.deleteAt(indexToDelete);
                    break;

                case 7:
                    plSpace("Count: " + sll.length());
                    break;

                case 8:
                    sll.print();
                    break;

                case 9:
                    pSpace("Enter number to find: ");
                    final int numToFind = inputInt();
                    sll.search(numToFind);
                    break;

                case 10:
                    for (int i = 0; i < 10; i++)
                        sll.insertRear(getRandomNumber(5));
                    break;

                case 0:
                    plSpace("</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                    break;

                default:
                    plSpace("Invalid option. Try again.");
                    break;
            }
            pl("\n  # ");
        }

    }*/

    /*private static void runQueue() {
        pl("• • • Stack Program • • •");
        Queue<Integer> queue = new Queue<>();

        pl("\nMenu:");
        pl("------------------");
        plSpace("1. EnQueue");
        plSpace("2. DeQueue");
        plSpace("3. Count");
        plSpace("4. Print");
        plSpace("5. fill queue with 10 random numbers");
        plSpace("0. Exit");


        scInit();
        rnInit();
        int cycle = 0;
        while (true) {

            pSpace("\n " + ++cycle + "• Enter your option: ");
            int queueOption = inputInt();

            switch (queueOption) {
                case 1:
                    pSpace("Enter value to enQueue: ");
                    int valueToEnqueue = inputInt();
                    queue.enQueue(valueToEnqueue);
                    break;

                case 2:
                    plSpace("DeQueued: " + queue.deQueue());
                    break;

                case 3:
                    plSpace("Count: " + queue.count());
                    break;

                case 4:
                    queue.print();
                    break;

                case 5:
                    for (int i = 0; i < 10; i++)
                        queue.enQueue(getRandomNumber(5));
                    break;

                case 0:
                    plSpace("</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                    break;

                default:
                    plSpace("Invalid option. Try again.");
                    break;
            }
            pl("\n  # ");
        }
    }*/

/*
    private static void runStack() {
        pl("• • • Stack Program • • •");
        Stack<Integer> stack = new Stack<>();

        pl("\nMenu:");
        pl("------------------");
        plSpace("1. Push");
        plSpace("2. Pop");
        plSpace("3. Peek");
        plSpace("4. Count");
        plSpace("5. Print");
        plSpace("6. fill array with 10 numbers");
        plSpace("0. Exit");


        scInit();
        rnInit();
        int cycle = 0;
        while (true) {

            pSpace("\n " + ++cycle + "• Enter your option: ");
            int stackOption = inputInt();

            switch (stackOption) {
                case 1:
                    pSpace("Enter value to push: ");
                    int valueToPush = inputInt();
                    stack.push(valueToPush);
                    break;

                case 2:
                    plSpace("Popped: " + stack.pop());
                    break;

                case 3:
                    plSpace("Peeked: " + stack.peek());
                    break;

                case 4:
                    plSpace("Count: " + stack.count());
                    break;

                case 5:
                    stack.print();
                    break;

                case 7:
                    for (int i = 0; i < 10; i++)
                        stack.push(getRandomNumber(5));
                    break;

                case 0:
                    plSpace("</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                    break;

                default:
                    pl("Invalid option. Try again.");
                    break;
            }
            pl("\n  # ");
        }
    }
*/

/*
    private static void runDynamicArray() {
        pl("• • • Dynamic Array Program • • •");
        DynamicArray<Integer> arr = new DynamicArray<>();
        scInit();
        rnInit();

        pl("\nMenu:");
        pl("------------------");
        plSpace("1. Add");
        plSpace("2. Delete");
        plSpace("3. Count");
        plSpace("4. Search");
        plSpace("5. Print");
        plSpace("6. Print with detail");
        plSpace("7. fill array with 10 random numbers");
        plSpace("0. Exit");

        int cycle = 0;
        while (true) {

            pSpace("\n " + ++cycle + "• Enter your option: ");
            int option = inputInt();

            switch (option) {
                case 1:
                    pSpace("Enter number to add: ");
                    final int num = inputInt();
                    arr.add(num);
                    break;
                case 2:
                    arr.delete();
                    break;
                case 3:
                    int count = arr.count();
                    plSpace("Number of elements: " + count);
                    break;
                case 4:
                    pSpace("Enter number to find: ");
                    final int numToFind = inputInt();
                    arr.search(numToFind);
                    break;
                case 5:
                    arr.print(false);
                    break;
                case 6:
                    arr.print(true);
                    break;
                case 7:
                    for (int i = 0; i < 10; i++)
                        arr.add(getRandomNumber(5));
                    break;
                case 0:
                    plSpace("</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                default:
                    pl("Invalid option. Try again.");
            }
            pl("\n  # ");
        }

    }
*/
}











