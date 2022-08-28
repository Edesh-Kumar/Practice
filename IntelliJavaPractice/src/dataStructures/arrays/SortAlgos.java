package dataStructures.arrays;
//https://www.youtube.com/watch?v=bBQkErahU9c&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=17 -- bubble sort video
//https://www.youtube.com/watch?v=wWhAhp6PIuQ&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=18 -- insertion sort video
//https://www.youtube.com/watch?v=B-nqY6IYqVw&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=19 -- selection sort video
//https://www.youtube.com/watch?v=iKGAgWdgoRk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=30 -- Merge Sort Video

import java.util.Arrays;

public class SortAlgos {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    ArraysClass.swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) return arr;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] mix = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;

        }
        while (i < left.length) {
            mix[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            k++;
            j++;
        }
        return mix;
    }
//    public static void mergeSort(int[] arr, int start, int end) {
//        if ((end - start) == 1) return;
//        int mid = (end + start) / 2;
//        mergeSort(arr, start, mid);
//        mergeSort(arr, mid, end);
//        merge(arr, start, mid, end);
//    }
//
//
//    static void merge(int[] arr, int s, int m, int e) {
//        int[] merged = new int[e - s];
//        int i = s, j = m, k = 0;
//
//        while (i < m && j < e) {
//            if (arr[i] < arr[j]) {
//                merged[k] = arr[i];
//                i++;
//            } else {
//                merged[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < m) {
//            merged[k] = arr[i];
//            i++;
//            k++;
//        }
//        while (j < e) {
//            merged[k] = arr[j];
//            j++;
//            k++;
//        }
//        System.arraycopy(merged, 0, arr, 0, merged.length);
//    }


    public static int[] insertionSort(int[] arr) {
        // taking two variables temp and j
        int temp, j;
        //traversing the array from second element to end. starting from second element,so we can compare it with the element behind it.
        for (int i = 1; i < arr.length; i++) {
            //storing the ith element in temp, so we don't lose the value.
            temp = arr[i];
            //traversing from i-1 to start of array and comparing temp with every element until a smaller element than temp is found.
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) arr[j + 1] = arr[j];
            //now we have found that element's actual position. we can now place it at its sorted position.
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            if (min != i) ArraysClass.swap(arr, i, min);

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 3, 6, 7, 5, 4};
        int[] arr1 = {4, 3, 7, 1, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
//        InsertionSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr2)));

//        System.out.println(Arrays.toString(selectionSort(arr1)));


    }
}
