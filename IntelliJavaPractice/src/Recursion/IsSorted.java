package Recursion;

public class IsSorted {
    public static boolean isSorted(int[] arr, int start) {
        if (start == arr.length-1) {
            return true;
        }
        return arr[start] <= arr[start + 1] && isSorted(arr, ++start);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 7,7 };
        System.out.println(isSorted(arr, 0));

    }
}
