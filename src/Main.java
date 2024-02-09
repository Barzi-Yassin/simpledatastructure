import dynamicarray.DynamicArray;
import general.Functions;

public class Main extends Functions {
    public static void main(String[] args) {
        runDynamicArray();
    }

    private static void runDynamicArray() {
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

            System.out.print("\n " + ++cycle + "• Enter your option: ");
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

    }
}











