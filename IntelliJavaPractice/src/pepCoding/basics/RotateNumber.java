package pepCoding.basics;

public class RotateNumber {
    public static int rotateNumber(int n, int k) {
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        if (k > digits) k %= digits;
        else if (k < (-1 * digits) && k < 0) k = digits + (k % digits);
        else if (k < 0) k = digits + k;


        return (int) ((n % Math.pow(10, k)) * Math.pow(10, digits - k) + (n / Math.pow(10, k)));
    }

    public static void main(String[] args) {
        System.out.println(rotateNumber(9837839, 1254));


    }
}
