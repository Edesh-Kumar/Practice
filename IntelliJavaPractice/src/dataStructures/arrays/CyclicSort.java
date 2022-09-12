package dataStructures.arrays;

import java.util.Arrays;

public class CyclicSort {
    public static void swap(int[] arr, int x, int y) {
        arr[x] += arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] -= arr[y];

    }

    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i]-1]) {
                swap(arr, i, arr[i] - 1);
            } else i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(sort(arr)));


    }
}
