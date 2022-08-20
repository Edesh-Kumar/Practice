package LeetCodeAndOthers;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class FindInRotatedSortedArrayWithDuplicates {
    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target || arr[start] == target || arr[end] == target) return true;
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }
            if (arr[mid] > arr[start]) {
                if (target > arr[start] && target < arr[mid]) end = mid - 1;
                else start = mid + 1;

            } else if (arr[mid] < arr[start]) {
                if (target > arr[mid] && target < arr[end]) start = mid + 1;
                else end = mid - 1;
            } else start = mid + 1;
        }
        return false;

    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int[] arr1 = {2, 5, 6, 0, 0, 1, 2};
        System.out.println(search(arr, 0));
        System.out.println(search(arr1, 3));
    }
}
