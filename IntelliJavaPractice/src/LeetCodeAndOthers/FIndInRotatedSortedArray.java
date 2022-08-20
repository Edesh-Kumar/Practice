package LeetCodeAndOthers;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class FIndInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int ftry = bsearch(nums, 0,pivot, target);
        if(ftry == -1){
            return bsearch(nums,pivot+1, nums.length-1, target);
        }else return ftry;
    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid =0;
        while (start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) return mid;
            else if (mid>start && arr[mid-1]>=arr[mid]) return mid-1;
            else if(mid<end && arr[start]>=arr[mid]) end = mid-1;
            else start=mid+1;
        }
        return mid;
    }
    public static int bsearch(int[] arr,int start, int end, int target){
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if (target>arr[mid]) start = mid+1;
            else  end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9  ,11,12,23};
        int[] arr1 = {1,3};
        System.out.println(search(arr1, 0));
    }
}
