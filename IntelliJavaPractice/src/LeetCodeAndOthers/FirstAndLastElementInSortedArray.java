package LeetCodeAndOthers;

import java.util.Arrays;

//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 10};
        System.out.println(Arrays.toString(binarySearch(arr, 7)));


    }

    public static int[] binarySearch(int[] arr, int key) {
       int[] ans  = {-1, -1};
       ans[0] = search(arr,key,true);
       ans[1] = search(arr,key,false);
       return ans;

    }
    public static int search(int[] arr,int key, boolean findFirstIndex ){
        int start =0;
        int end = arr.length-1;
        int mid =0;
        int ans =-1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid]==key) {
                ans=mid;
                if(findFirstIndex) end = mid-1;
                else start = mid+1;
            }
           else if(key<arr[mid]) end = mid-1;
            else start = mid+1;

        }
        return ans;
        }
}
