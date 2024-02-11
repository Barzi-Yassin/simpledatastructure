package algorithms.sorting;

import general.Functions;

public class Bubble extends Functions {
    public static int[] bubble(int[] arr) {
        int temp;
        int countRounds = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                countRounds++;
                if (arr[j] > arr[j + 1]) {
                    pl(countRounds + " • Pass (" + (i + 1) + "): " + arr[j] + "_" + arr[j + 1] + " Swapped");
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        pl("Number of rounds: " + countRounds);
        return arr;
    }

    public static int[] bubbleImproved(int[] arr) {
        int temp;
        int countRounds = 0;
        boolean swapped = true;
        for (int i = 0; (i < arr.length - 1 && swapped); i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                countRounds++;
                if (arr[j] > arr[j + 1]) {
                    pl(countRounds + " • Pass (" + (i + 1) + "): " + arr[j] + "_" + arr[j + 1] + " Swapped: " + swapped);
                    swapped = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            pl("");
        }
        pl("Number of Rounds: " + countRounds);
        return arr;
    }
}
