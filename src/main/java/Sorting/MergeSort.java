package Sorting;
import util.Print;

import java.util.Arrays;

/**
 * Algorithm: It is a divide and conquer algorithm. Its all about breaking down the array to its individual element.
 * Once we reach its last elements merge back in Ascending order.
 *
 * 1. Use recursion to split the array to its individual element level.
 * 2. Merge the result from the recursion in an sorted result array.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(mergeSort(data), 1);

        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(mergeSort(data), 1);
    }

    public static int[] mergeSort(int[] data) {
        if(data.length <= 1) {
            return data;
        }
        int middle = data.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(data, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(data, middle, data.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int counter = 0;
        int i = 0, j = 0;
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                result[counter++] = left[i++];
            } else {
                result[counter++] = right[j++];
            }
        }
        while(i < left.length) {
            result[counter++] = left[i++];
        }
        while(j < right.length) {
            result[counter++] = right[j++];
        }
        return result;
    }
}
