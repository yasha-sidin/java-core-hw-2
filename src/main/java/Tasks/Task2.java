package Tasks;

/**
 * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {
    /**
     * Find differance between max and min array's values
     * @param arr array
     * @return number which means differance between max and min array's values
     */
    public static int diffMaxMin(int[] arr) {
        int arrSize = arr.length;
        if (arrSize < 1) throw new RuntimeException("Need not empty array. ");
        if (arrSize == 1) return 0;
        int max;
        int min;
        int max1 = arr[0];
        int max2 = arr[arrSize - 1];
        int min1 = max1;
        int min2 = max2;
        int j = arrSize - 2;
        for(int i = 1; i < arrSize / 2; i++, j--) {
            if (max1 < arr[i]) max1 = arr[i];
            if (min1 > arr[i]) min1 = arr[i];
            if (max2 < arr[j]) max2 = arr[j];
            if (min2 > arr[j]) min2 = arr[j];
        }
        if (max1 > max2) max = max1;
        else max = max2;
        if (min1 < min2) min = min1;
        else min = min2;
        return max - min;
    }
}
