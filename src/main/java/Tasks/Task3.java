package Tasks;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Task3 {
    /**
     * If two adjacent elements equals 0 function returns true unless false
     * @param arr array
     * @return true or false in dependence of main condition
     */
    public static boolean findDoubleZero(int[] arr) {
        int arraySize = arr.length;
        if (arraySize == 1 || arraySize == 0) return false;
        for (int i = 1; i < arraySize; i++) {
            if (arr[i - 1] == 0 && arr[i] == 0) return true;
        }
        return false;
    }
}
