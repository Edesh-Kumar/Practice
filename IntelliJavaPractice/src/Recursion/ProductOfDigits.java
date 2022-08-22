package Recursion;

public class ProductOfDigits {
    public static int productOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * (productOfDigits(n / 10));
    }

    public static void main(String[] args) {

    }
}
