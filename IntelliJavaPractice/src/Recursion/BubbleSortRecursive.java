package Recursion;

public class BubbleSortRecursive {
//    {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static void sort(int[] arr, int start, int end) {
        if (end == 0) return;

        if (start < arr.length - 1) {
            if (arr[start] > arr[start + 1]) {
                arr[start] = arr[start] ^ arr[start + 1];
                arr[start + 1] = arr[start] ^ arr[start + 1];
                arr[start] = arr[start] ^ arr[start + 1];
            }
            sort(arr,++start,end);
        } else sort(arr, 0, end-1);



    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }
}
