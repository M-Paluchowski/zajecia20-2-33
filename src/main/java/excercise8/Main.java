package excercise8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integers = {5, 1, 2, 3, 5, 7, 0, 34, 5, -1};
        bubbleSortWhile(integers);
        System.out.println(Arrays.toString(integers));
    }

    private static void bubbleSort(int[] numbersToSort) {
        for (int i = 1; i < numbersToSort.length; i++) {
            for (int j = 1; j < numbersToSort.length; j++) {
                int number = numbersToSort[j];
                int previousNumber = numbersToSort[j - 1];
                if (number < previousNumber) {
                    numbersToSort[j] = previousNumber;
                    numbersToSort[j - 1] = number;
                }
            }
        }
    }

    private static void bubbleSortWhile(int[] numberToSort) {
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 1; i < numberToSort.length; i++) {
                int number = numberToSort[i];
                int previousNumber = numberToSort[i - 1];
                if (number < previousNumber) {
                    numberToSort[i] = previousNumber;
                    numberToSort[i - 1] = number;
                    hasChanged = true;
                }
            }
        }
    }
}
