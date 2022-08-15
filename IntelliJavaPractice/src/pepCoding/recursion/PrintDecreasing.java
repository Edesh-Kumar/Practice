package pepCoding.recursion;

public class PrintDecreasing {
    public static void printDecreasing(int n) {

        if (n > 0) {
            System.out.println(n);
            printDecreasing(n - 1);
        }
    }

    public static void main(String[] args) {

        printDecreasing(10);
    }
}
