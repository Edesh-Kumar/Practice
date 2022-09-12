package LeetCodeAndOthers;

import dataStructures.arrays.ArraysClass;

public class FindTheDuplicateNumber {
    public static int find(int[] nums){
        int i=0;
        while (i<nums.length){
            if(nums[i]-1!=i){
                if(nums[i] ==nums[nums[i]-1]) return nums[i];
                else ArraysClass.swap(nums,i, nums[i]-1);
            }else i++;
        }
        return -1;
        }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(find(arr));

    }
}
