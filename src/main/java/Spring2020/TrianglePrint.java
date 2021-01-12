package Spring2020;

/**
 * Lookup: https://cs.txstate.edu/media/uploads/files/programming-Spring-2020.pdf
 */
public class TrianglePrint {

    public static void main(String ... args) {
        triangle(7);
    }

    public static void triangle(int num) {
        StringBuilder result = new StringBuilder();
        int counter = num - 1;
        // i = number of rows
        for(int i = 0; i < num; i++) {

            // j is the column
            for(int j = 0; j < num; j++) {
                if(j >= counter) {
                    result.append("*");
                } else {
                    result.append(" ");
                } 
            }
            // Add new line each time
            result.append("\n");
            counter--;
        }
        System.out.println(result.toString());
    }
}

// num 7
// counter = num - 1 - 6, 5
//      0      1     2     3     4     5      6 
// 0  0-0=0  1-0=1 2-0=2  3-0=3 4-0=4  5-0=5 6-0=6
// 1  0-1=-1  1-1=0 2-1=1  3-1=2 4-1=3  5-1=4 6-1=5         