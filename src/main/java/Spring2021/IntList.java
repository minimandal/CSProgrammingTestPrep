package Spring2021;

import util.Print;

public class IntList {

    int[] nums;
    int count = 0;
    final int CAPACITY = 100;

    public IntList() {
        nums = new int[CAPACITY];
        count = 0;
    }

    public void add(int x) {
        if(count >= CAPACITY) {
            throw new IllegalStateException("Reached Capacity");
        }

        nums[count++] = x;
    }

    public boolean isPositive() {
        if(count == 0) {
            return true;
        }

        boolean isPositiveValue = true;
        for (int i = 0; i < count ; i++) {
            if(nums[i] <= 0) {
                return false;
            }
        }
        return isPositiveValue;
    }

    public double mean() {
        double mean = 0.0;
        for (int i = 0; i <= count ; i++) {
            mean = mean + nums[i];
        }
        mean = mean / count;
        return mean;
    }
    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(5);
        list.add(4);
        list.add(7);
        Print.printArray(list.nums, 0);
        System.out.println(list.isPositive());
        System.out.println(list.mean());
    }
}
