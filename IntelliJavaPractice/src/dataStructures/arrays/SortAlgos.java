package dataStructures.arrays;
//https://www.youtube.com/watch?v=bBQkErahU9c&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=17 -- bubble sort video
//https://www.youtube.com/watch?v=wWhAhp6PIuQ&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=18 -- insertion sort video
//https://www.youtube.com/watch?v=B-nqY6IYqVw&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=19 -- selection sort video

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
//        InsertionSort(arr);
        System.out.println(Arrays.toString(selectionSort(arr1)));


    }
}
