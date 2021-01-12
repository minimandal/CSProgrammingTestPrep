package Sorting;

import util.Print;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(selectionSort(data), 1);
        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(selectionSort(data), 1);
    }
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
