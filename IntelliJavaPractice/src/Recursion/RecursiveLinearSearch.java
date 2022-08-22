package Recursion;

import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static int search(int[] arr, int start, int key) {
        if (start == arr.length) {
            return -1;
        }
        return arr[start] == key ? start : search(arr, ++start, key);
    }

    public static ArrayList<Integer> searchAllIndex(int[] arr, int start, int key, ArrayList<Integer> al) {
        if (start == arr.length) {
            if (al.isEmpty()) {
                al.add(-1);
            }
            return al;
        }
        if (arr[start] == key) {
            al.add(start);
        }
        return searchAllIndex(arr, ++start, key, al);
    }

    public static ArrayList<Integer> searchAlt(int[] arr, int start, int key) {
        if (start == arr.length) return new ArrayList<>();

        if (arr[start] == key) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(start);
            al.addAll(searchAlt(arr, ++start, key));
            return al;
        }
        return searchAlt(arr, ++start, key);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 6, 8, 12, 8};
        System.out.println(searchAllIndex(arr, 0, 8, new ArrayList<>()));
        System.out.println(searchAlt(arr, 0, 6));

    }
}
