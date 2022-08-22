package Recursion;

public class CountZeroes {
    public static int countZeroesRecursive(int n) {
        if(n<10) return 0;
        return (n % 10 == 0 ? 1 : 0) + countZeroesRecursive(n / 10);
    }

    public static void main(String[] args) {

    }
}
