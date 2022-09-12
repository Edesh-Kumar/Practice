package LeetCodeAndOthers;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if ( nums[i] != i && nums[i]!=nums.length) {
                swap(nums, i, nums[i]);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j) return j;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 3,0,1};

        System.out.println(missingNumber(nums));
        System.out.println(Arrays.toString(nums));
    }

}
