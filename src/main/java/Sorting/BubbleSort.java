package Sorting;

import util.Print;

/**
 * Algorithm - All about getting the bigger value bubble up to the right side of the array.
 * 1. Iterate over the array 0 to n. Consider 6 values, integers in this case.
 *    Ex: 0, n-5, n-4, n-3, n-2, n-1, n
 * 2. Compare 2 elements adjacent each time and swap the bigger element to the right.
 *     (0, n-5), (n-5, n-4), (n-4, n-3), (n-3, n-2), (n-2, n-1), (n-1, n)
 *     At this point nth element should be the largest.
 * 3. After 1 iteration nth element will be the biggest element in the array.
 *    Hence in next iteration ignore nth element in 2nd ignore n-1.
 * 4. Add a boolean to check if there was swap in inner loop iteration. If no then the array is sorted.
 *
 * Outer for loop starts at the n length and decrements to 0
 * Inner loop starts at 0 and increments till outer loop value.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(bubbleSort(data), 1);
        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(bubbleSort(data), 1);
    }

    /**
     * This method implement the algorithm to sort an Array using Buuble Sort algorithm.
     * @param data - Unsorted array of elements
     * @return Sorted array in ascending order.
     *
     * Example:
     * data = [1,4,7,3,9] n = 5
     * i=4 | j = 0 | 1,4,7,3,9
     *     | j = 1 | 1,4,7,3,9
     *     | j = 2 | 1,4,3,7,9
     *     | j = 3 | 1,4,3,7,9
     * ------------------------
     * i=3 | j = 0| 1,3,4,7,9
     *     | j = 1| 1,3,4,7,9
     *     | j = 2| 1,3,4,7,9
     * ------------------------
     * i=2 | j = 0| 1,3,4,7,9
     *     | j = 1| 1,3,4,7,9
     * ------------------------
     * i=1 | j = 0| 1,3,4,7,9
     * ------------------------
     * i=0 | j Does not execute
     */
    public static int[] bubbleSort(int[] data) {

        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(data[j] > data[j+1]) {
                    swap(data, j, j+1);
                }
            }
        }
        return data;
    }

    /**
     * This method implement the algorithm to sort an Array using Buuble Sort algorithm.
     * @param data - Unsorted array of elements
     * @return Sorted array in descending order.
     *
     * In Optimized method we can add a boolean flag to avoid unnecessary loops once the array is sorted.
     * Example:
     * data = [1,4,7,3,9] n = 5
     * isSwapped = false
     * i=4 | j = 0 | 1,4,3,7,9 | isSwapped = true
     *     | j = 1 | 1,3,4,7,9 | isSwapped = true
     *     | j = 2 | 1,3,4,7,9 | isSwapped = false
     *     | j = 3 | Break
     */
    public static int[] bubbleSortOptimized(int[] data) {
        boolean isSwapped = false;
        for (int i = data.length - 1; i >= 0; i--) {
            isSwapped = false;
            for (int j = 0; j < i; j++) {
                if(data[j] > data[j+1]) {
                    swap(data, j, j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        return data;
    }

    /**
     * This method swaps the element on the array at the given index.
     * @param data - Array of Integers
     * @param left - Left index
     * @param right - Right index
     */
    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
