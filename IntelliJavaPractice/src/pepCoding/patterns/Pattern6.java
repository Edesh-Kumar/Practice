package pepCoding.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n / 2; j++) {
                System.out.print("*   ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("    ");

            }
            for (int j = n / 2; j > i; j--) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }

            for (int j = n / 2 + 1; j >= i * 2; j--) {
                System.out.print("    ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");

            }
            System.out.println();


        }
    }
}
