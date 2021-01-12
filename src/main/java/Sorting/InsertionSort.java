package Sorting;

import util.Print;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(insertionSort(data), 1);
        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(insertionSort(data), 1);
    }
    public static int[] insertionSort(int[] data) {
        int target = 0;
        int index = 0;
        for (int i = 1; i < data.length; i++) {
            target = data[i];
            index = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if(target < data[j]) {
                    swap(data, index, j);
                    index = j;
                }
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
