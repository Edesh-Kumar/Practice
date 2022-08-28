package companies;

import java.util.HashMap;

public class BravuraSolutions {
    public static boolean palindromeOrNot(int i) {
        int temp = i;
        int res = 0;
        while (i > 0) {
            res = (res * 10) + (i % 10);
            i /= 10;
        }
        return res == temp;
    }

    public static boolean isPrime(int n) {
        return n % 2 == 0;
    }

    public static void frequencyOfNumber(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
            else hm.put(i, 1);
        }

        System.out.println(hm);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static String reverseStringWOUsingSpace(char[] ch) {
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            ch[start] ^= ch[end];
            ch[end] ^= ch[start];
            ch[start] ^= ch[end];
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pid = partition(arr, low, high);
            quickSort(arr, low, pid - 1);
            quickSort(arr, pid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 14, 17, 6, 5, 11};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        String str = "HelloWorld";
        System.out.println(reverseStringWOUsingSpace(str.toCharArray()));


    }
}
