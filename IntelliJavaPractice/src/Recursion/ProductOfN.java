package Recursion;

public class ProductOfN {
    public static int productOfNto1(int n) {
        if (n == 1) {
            return n;
        }
        return n * productOfNto1(n - 1);
    }

    public static void main(String[] args) {

    }
}
