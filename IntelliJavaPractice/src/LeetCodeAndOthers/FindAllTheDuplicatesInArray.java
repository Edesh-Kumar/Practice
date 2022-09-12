package LeetCodeAndOthers;

import dataStructures.arrays.ArraysClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllTheDuplicatesInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i) {
                if (nums[i] == nums[nums[i] - 1]) {
                    i++;
                } else ArraysClass.swap(nums, i, nums[i] - 1);
            } else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) al.add(nums[j]);
        }
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDuplicates(arr));

    }
}
