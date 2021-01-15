package Spring2021;

public class PrintDollar {

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int x) {
        if (x <= 0) {
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if(j < i) {
                    result.append("+");
                }
                if (j > i) {
                    result.append("-");
                }
                if(j == i) {
                    result.append("$");
                }
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }
}
