package Fall2020;

/**
 * 3. (2 pts) Write a recursive function containsOnly that takes three parameters:
 * an array, its size, and a target value. The array contains integers, and the target
 * value is an integer. The function should return true if every value in the array is
 * equal to the target value, otherwise it should return false. Note: your function
 * should return true if the size is 0.
 * Do not use loops, extra parameters, or global or static variables
 */
public class RecursiveArray {
    public static void main(String[] args) {
        int[] data = new int[] {4,5,6,7};
        System.out.println(containsOnly(data, data.length, 4));
        data = new int[] {4,4,4,4,4,4};
        System.out.println(containsOnly(data, data.length, 4));
    }

    public static boolean containsOnly(int[] array, int size, int target) {

        if (size == 0) {
            return true;
        }
        return containsOnly(array, size, 0, target);
    }

    public static boolean containsOnly(int[] array, int size, int itr, int target) {

        if(size - 1 == itr) {
            if(array[itr] == target){
                return true;
            } else {
                return false;
            }
        } else {
            return containsOnly(array, size, itr + 1, target);
        }
    }

}