package Spring2020;

import util.Print;

/**
 * Lookup: https://cs.txstate.edu/media/uploads/files/programming-Spring-2020.pdf
 * 3. (2.5 pts) Implement the following two functions that operate over arrays of int
 * (assume the values in the array are unique):
 * A. indexOfMax (array,size): This function should return the index of the
 * largest element of the array (assume that the size is greater than 0).
 * B. selectionSort(array,size): This function should sort the elements of
 * the array using the following algorithm: find the largest element and move it
 * into the last position, then find the next largest element and move it into the
 * second to last position, and so on, until the entire array is sorted.
 * —Do not use any other algorithm to sort the list.
 * —This function should call the indexOfMax function from part A.
 */
public class ArrayProgram {
    public static void main(String[] args) {
        int[] data = new int[]{5, 8, 9, 3, 4, 10};
        Print.printArray(data, 0);
        System.out.println("Max Index = " + indexOfMax(data, data.length));
        selectionSort(data, data.length);

        data = new int[]{20, 5, 8, 9, 3, 4, 10};
        Print.printArray(data, 0);
        System.out.println("Max Index = " + indexOfMax(data, data.length));
        selectionSort(data, data.length);

    }

    public static void selectionSort(int[] array, int size) {
        for (int i = size - 1; i >= 0  ; i--) {
            int index = indexOfMax(array, i + 1);
            if(index != i) {
                swap(array, index, i);
            }
        }
        Print.printArray(array, 1);
    }

    private static void swap(int[] array, int left, int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    public static int indexOfMax(int[] array, int size){
        int index = 0;
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < size; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

