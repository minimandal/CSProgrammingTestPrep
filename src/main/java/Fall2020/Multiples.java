package Fall2020;

/**
 * 1. (2 pts) Write a function named multiples that takes an integer n as an
 * argument. The function outputs a table of the multiples of n, formatted into 3
 * rows of 10 columns. For example, multiples(7) would display the following:
 *  7 14 21 28 35 42 49 56 63 70
 *  77 84 91 98 105 112 119 126 133 140
 *  147 154 161 168 175 182 189 196 203 210
 * (the values do not need to line up in columns, but they should be separated by at
 * least one space and there must be exactly 10 values on each line).
 */
public class Multiples {
    final static int ROWS = 3;
    final static int COL = 10;
    public static void main(String[] args) {
        multiples(7);
        multiples(10);
    }

    public static void multiples(int n) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COL; j++) {
                result.append(n * counter + " ");
                counter++;
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }
}
