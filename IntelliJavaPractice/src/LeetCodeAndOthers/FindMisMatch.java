package LeetCodeAndOthers;

import java.util.Arrays;

public class FindMisMatch {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] res = new int[2];
        while (i < nums.length) {
            if (nums[i] - 1 != i) {
                if (nums[i] == nums[nums[i] - 1]) {
                    i++;
                } else swap(nums, i, nums[i] - 1);
            } else i++;
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j){
                res[0] = nums[j];
                res[1] = j+1;
            }
        }

        return res;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] arr1 = {8, 7, 3, 5, 3, 6, 1, 4};
        System.out.println(Arrays.toString(findErrorNums(arr1)));
    }
}
