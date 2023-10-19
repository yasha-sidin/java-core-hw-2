import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] testArray = getTestArray(7, 0, 4);
        printArray(testArray);
        /**
         * TASK 1
         */
        System.out.println("Amount of evens: " + Task1.countEvens(testArray));
        /**
         * TASK 2
         */
        System.out.println("Differance between max and min: " + Task2.diffMaxMin(testArray));
        /**
         * TASK 3
         */
        System.out.println("Check double zeros: " + Task3.findDoubleZero(testArray));
    }

    public static int[] getTestArray(int size, int start, int end) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.ints(size, start, end).findFirst().getAsInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
