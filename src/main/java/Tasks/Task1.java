package Tasks;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class Task1 {
    /**
     * Count evens in array
     * @param arr array
     * @return amount of evens in array
     */
    public static int countEvens(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
