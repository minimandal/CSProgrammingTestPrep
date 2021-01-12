package Spring2020;

/**
 * Lookup: https://cs.txstate.edu/media/uploads/files/programming-Spring-2020.pdf
 * 2.(1.5 pts) Write a recursive function named sumOver that takes an int parameter
 * n and returns a double value which is the sum of the reciprocals of the first n
 * positive integers.
 *
 * The reciprocal of x is 1.0/x.
 *
 * For example, sumOver(3) returns 1.833 which is 1.0/1 + 1.0/2 + 1.0/3.
 * Your function must work for value of n greater than or equal to 0.
 * By definition, sumOver(0) = 0.
 * Do not use loops, extra parameters, or global or static variables
 */
public class RecursiveReciprocals {
    public static void main(String[] args) {
        System.out.println(sumOver(3));
    }

    public static Double sumOver(int num) {
        if(num == 0) {
            return 0.0;
        }
        return  1.0 / num + sumOver(num - 1);
    }

}
