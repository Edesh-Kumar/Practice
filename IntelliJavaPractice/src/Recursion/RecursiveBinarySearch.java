package Recursion;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) return mid;
        return (key > arr[mid]) ? binarySearch(arr, mid + 1, end, key) : binarySearch(arr, start, mid - 1, key);

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9, 11, 20, 32, 34, 60};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 20));

    }
}
