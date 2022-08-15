package LeetCodeAndOthers;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakOfMountain {
    public static int search(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) e = mid;
            else s = mid + 1;
        }
        return s;


    }

    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int[] arr2 = {3, 5, 3, 2, 0};
        System.out.println(search(arr2));

    }
}
