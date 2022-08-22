package Recursion;

public class FindMinAndMax {
    public static int findMax(int[] arr, int i, int max) {
        if (i == arr.length) return max;
        if (arr[i] > max) max = arr[i];
        return findMax(arr, ++i, max);
    }
    public static int findMax(int[] arr, int n) {
        if (n == 0) return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static int findMin(int[] arr, int i, int min) {
        if (i == arr.length) return min;
        if (arr[i] < min) min = arr[i];
        return findMin(arr, ++i, min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 9, 3, 79, 3,};
        System.out.println(findMax(arr, 0, arr[0]) + " " + findMin(arr, 0, arr[0]));

    }
}
