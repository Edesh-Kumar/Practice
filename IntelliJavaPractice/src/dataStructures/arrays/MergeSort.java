package dataStructures.arrays;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr.length==1) return arr;
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }
    public static void sortAlt(int[] arr, int start, int end) {
        if (end-start==1) return;
        int mid = start+(end-start)/2;
        sortAlt(arr,start,mid);
        sortAlt(arr,mid,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i=start,j=mid,k=0;
        int[] mix = new int[end-start];
        while (i<mid && j<end){
            if (arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }else {
                mix[k]= arr[j];
                j++;
            }
            k++;
        }
        if(i<mid){
            mix[k]= arr[i];
            i++;
            k++;
        }
        if(j<end){
            mix[k]= arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l]= mix[l];
        }

    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] mix = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = left[j];
            j++;
            k++;
        }
        return mix;

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(sort(arr)));
            sortAlt(arr,0,arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
