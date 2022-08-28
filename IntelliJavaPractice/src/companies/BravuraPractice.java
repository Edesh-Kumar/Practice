package companies;

import java.util.Arrays;
import java.util.HashMap;

public class BravuraPractice {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s > e) return;
        int pid = partition(arr, s, e);
        quickSort(arr, s, pid - 1);
        quickSort(arr, pid + 1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, e);
        return i;
    }

    public static HashMap<Integer, Integer> frequencyOfNumber(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else hm.put(i, 1);

        }
        return hm;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j + 1, j);
            }

        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) arr[j + 1] = arr[j];
            arr[j + 1] = temp;
        }


        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int min, j;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            swap(arr, min, i);
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;
        int mid = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] == key) return mid;
            else if (key > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }


    public static String reverseStringWOUsingExtraSpace(char[] ch) {
        int i = 0, j = ch.length - 1;
        while (i < j) {
            ch[i] ^= ch[j];
            ch[j] ^= ch[i];
            ch[i] ^= ch[j];
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int toCompare = 0;
        while (temp > 0) {
            toCompare *= 10;
            toCompare += temp % 10;
            temp /= 10;
        }
        System.out.println(toCompare);
        return toCompare == n;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr1 = {1, 4, 1, 2, 1, 4, 8, 8, 9, 5};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(arr));

        String str = "HelloWorld";
        System.out.println(reverseStringWOUsingExtraSpace(str.toCharArray()));
        System.out.println(frequencyOfNumber(arr1));
        System.out.println(binarySearch(arr, 6));


    }
}
