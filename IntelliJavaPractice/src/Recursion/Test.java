package Recursion;

import companies.VelocitySoft;

public class Test {
    public static int fibonacci(int n) {

        if (n < 2) return n;

        return (fibonacci(n - 1) + fibonacci(n - 2));

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    VelocitySoft.swap(arr, j + 1, j);
                    swapped = true;
                }
            }
            if (!swapped) return arr;

        }
        return arr;
    }

    public static int[] bubbleSortRecursive(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr;
        }

        boolean swapped = false;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j + 1] < arr[j]) {
                VelocitySoft.swap(arr, j + 1, j);
                swapped = true;
            }
        }
        if (!swapped) return arr;
        else return bubbleSortRecursive(arr, i + 1);
    }


    public static int printNum(int n) {
        if (n == 1) return n;
        System.out.println(printNum(n - 1));
        return n;
    }

    static int binarySearch(int[] arr, int s, int e, int target) {
        if (s > e) {
            return -1;

        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) return mid;
        else if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, e, target);
        } else {
            return binarySearch(arr, s, mid - 1, target);
        }

    }

    public static void sumTriangle(int[] arr) {
        if (arr.length == 0) return;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        sumTriangle(newArr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int findMin(int[] arr, int index, int min) {

        if (index == arr.length) return arr[min];
        else {
            if (arr[index] < arr[min]) min = index;
            return findMin(arr, index + 1, min);

        }
    }

    //    public static int findMax(int[] arr, int n) {
//        if (n == 0) return arr[0];
//        return Math.max(arr[n - 1], findMax(arr, n - 1));
//
//    }
    public static int findMax(int[] arr, int n, int max) {
        if (n == arr.length) {
            return arr[max];

        }
        if (arr[n] > arr[max]) max = n;
        return findMax(arr, n + 1, max);
    }

    public static int search(int[] arr, int target) {
        return binarySearch(arr, 0, arr.length - 1, target);

    }

    public static int linearSearch(int[] arr, int k, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == k) return i;
        else return linearSearch(arr, k, i + 1);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(48));
//        printNum(5);
        int[] arr = {5, 6, 10, 11, 170, 60, 66, 70, 90};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 60, 5, 8, 10, 0};
        int i = 1;




    }
}
