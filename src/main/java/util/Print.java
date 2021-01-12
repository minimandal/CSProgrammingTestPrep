package util;

public class Print {
    public static void printArray(int[] data, int type) {
        if(type == 0) {
            System.out.print("Input array : ");
        } else if(type == 1){
            System.out.print("Output array: ");
        }else if(type == 2){
            System.out.print("Mid array   : ");
        }
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if(i == data.length - 1){
                System.out.print(data[i] + "]");
            } else {
                System.out.print(data[i] + ",");
            }

        }
        System.out.println("\n");
    }
}
