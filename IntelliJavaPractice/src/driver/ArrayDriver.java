package driver;
import dataStructures.arrays.ArraysClass;

import java.util.Arrays;

public class ArrayDriver {
    public static  int removeDuplicates(int[] nums) {
        // Assume first element is unique
        int prev = nums[0];
        int k = 1; // Pointer to update unique element

        for (int i = 1; i < nums.length; i++){

            // Update the element when it is unique
            // i.e when the current element is not same as prev element
            if (nums[i] != prev)
            {
                nums[k] = nums[i];
                k++;
                prev = nums[i];

            }
        }

        return k;
    }
    public static int removeElement(int[] nums, int val) {
        int k =1;
        for(int i=0;i<nums.length;i++){
            k++;
            if(nums[i]==val){
                int j = i+1;
                while(k<nums.length){
                    ArraysClass.swap(nums,j-1,j);
                }

            }
        }
        return k;

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
//        int[] res = ArraysClass.reverse(a);
//        System.out.println(Arrays.toString(res));
//        System.out.println(removeDuplicates(a));
//        for(int i : a){
//            System.out.print(i+" ");
//        }
//        int k = removeElement(a, 0);
//        for(int i : a){
//            System.out.print(i+" ");
//        }
        ArraysClass.linearSearch(a,8);



    }
}

