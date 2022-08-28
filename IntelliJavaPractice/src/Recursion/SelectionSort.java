package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr, int start, int pos, int min) {
        if (pos == arr.length) return;
        if (start < arr.length - 1) {
            if (arr[start] < arr[min]) min = start;
            sort(arr, ++start, pos, min);
        } else {
            int temp = arr[pos];
            arr[pos] = arr[min];
            arr[min] = temp;

            sort(arr, pos + 1, ++pos, 0);
        }

    }


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
}
