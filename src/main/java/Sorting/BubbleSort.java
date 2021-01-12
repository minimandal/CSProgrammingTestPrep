package Sorting;

import util.Print;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[]{1,4,7,3,9};
        Print.printArray(data, 0);
        Print.printArray(bubbleSort(data), 1);
        data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Print.printArray(data, 0);
        Print.printArray(bubbleSort(data), 1);
    }
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

    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
}
