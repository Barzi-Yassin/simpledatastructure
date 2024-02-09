import dynamicarray.DynamicArray;
import general.Functions;
import stack.Stack;

public class Main extends Functions {
    public static void main(String[] args) {
        pl("<Programmed by: Barzi Yassin Karim>\n");
//        runDynamicArray();
        runStack();
    }

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

                case 0:
                    plSpace("\n</exited>");
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

    /*private static void runDynamicArray() {
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
        plSpace("7. fill array with 10 numbers");
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
                    plSpace("\n</exited>");
                    scDispose();
                    rnDispose();
                    System.exit(0);
                default:
                    pl("Invalid option. Try again.");
            }
            pl("\n  # ");
        }

    }*/
}











