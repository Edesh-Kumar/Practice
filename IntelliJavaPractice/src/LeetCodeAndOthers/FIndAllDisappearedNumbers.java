package LeetCodeAndOthers;

import dataStructures.arrays.ArraysClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class FIndAllDisappearedNumbers {

    public static List<Integer> find(int[] arr) {
        int i = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] - 1 != i) {
                if (arr[i] == arr[arr[i] - 1]) {
                    i++;
                } else ArraysClass.swap(arr, i, arr[i] - 1);

            } else i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] -1 != j) al.add(j+1);
        }


        return al;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(find(arr));


    }
}
