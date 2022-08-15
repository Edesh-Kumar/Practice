package dataStructures.arrays;


import java.util.Arrays;

public class SortAlgos {
    static int c;

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                c++;
                if (arr[j - 1] > arr[j]) {
                    ArraysClass.swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) return arr;
        }
        return arr;
    }

    public static int[] InsertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) arr[j + 1] = arr[j];
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 3, 6, 7, 5, 4};
        int[] arr1 = {4, 3, 7, 1, 5};
//        InsertionSort(arr);
        System.out.println(Arrays.toString(bubbleSort(arr1)));
        System.out.println(c);


    }
}
