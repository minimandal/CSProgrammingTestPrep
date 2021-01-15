package Sorting;

import util.Print;

/**
 * Algorithm: Its all about searching for the smallest in the array and swapping to the left of the array.
 * 1. First element is considered the smallest. Loop the rest of the array and identify the smallest and swap.
 * 2. After first iteration the very first element at 0th position is smallest and sorted.
 * 3. Continue with the same process to the rest of the array.
 * 4. Manage the index as this is needed to swap.
 *
 * Outer loop to skip left sorted elements after each iteration.
 * Inner loop to search for the smalled element in the rest of the array.
 * Track index of the smallest in the array to swap.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(selectionSort(data), 1);
        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(selectionSort(data), 1);
    }

    /**
     * This method sorts the array using Selection Sorting method
     * @param data - unsorted array
     * @return - Ascending Sorted array
     *
     * Example:
     * data = [1,4,7,3,9] n = 5 minVal = 1 | index = 0
     * i=0 | j = 1 | 1,4,7,3,9 | minVal = 1 | index = 0
     *     | j = 2 | 1,4,7,3,9 | minVal = 1 | index = 0
     *     | j = 3 | 1,4,7,3,9 | minVal = 1 | index = 0
     * -------------------------------------------------
     * i=1 | j = 2 | 1,4,7,3,9 | minVal = 3 | index = 3 | 1,3,7,4,9
     *     | j = 3 | 1,3,7,4,9 | minVal = 4 | index = 3 | 1,3,4,7,9
     * -------------------------------------------------
     * i=2 | j = 3 | 1,3,4,7,9 | minVal = 7 | index = 3 | 1,3,4,7,9
     * -------------------------------------------------
     * i=3 | j loop breaks
     */
    public static int[] selectionSort(int[] data) {
        for (int i = 0; i <= data.length - 1; i++) {
            int min = data[i];
            int index = i;
            for (int j = i + 1; j <= data.length - 1; j++) {
                if(data[j] < min) {
                    min = data[j];
                    index = j;
                }
            }
            if(data[i] != data[index]) {
                swap(data, i, index);
            }
        }
        return data;
    }

    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
