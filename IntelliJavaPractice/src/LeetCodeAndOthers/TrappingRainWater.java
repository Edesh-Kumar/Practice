package LeetCodeAndOthers;

import java.util.Arrays;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static int solve(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int leftmax = arr[0], rightmax = arr[arr.length-1];
        int i=0, j= arr.length-1;
        int result =0;
        while (i< arr.length && j>=0){
            if(arr[i]>leftmax) leftmax= arr[i];
            left[i] =leftmax;
            if(arr[j]>rightmax) rightmax= arr[j];
            right[j] = rightmax;
            i++;
            j--;
        }
        while(i<arr.length){
            result+=(left[i]<right[i]?left[i]:right[i])-arr[i];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        long starttime = System.nanoTime();
        System.out.println(solve(arr));
        long endtime = System.nanoTime();
        System.out.println((endtime - starttime));
    }
}
