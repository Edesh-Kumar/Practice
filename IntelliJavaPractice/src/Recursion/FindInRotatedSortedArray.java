package Recursion;

public class FindInRotatedSortedArray {
    public static int find(int[] arr, int start, int end, int key) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) return mid;
        if (arr[start] <= arr[mid]) {
            if (key >= arr[start] && key < arr[mid]) return find(arr, start, mid - 1, key);
            else return find(arr, mid + 1, end, key);
        } else if (key >= arr[mid] && key <= arr[end]) return find(arr, mid + 1, end, key);
        else return find(arr, start, mid - 1, key);

    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(find(arr, 0, arr.length - 1, 4));

    }
}
