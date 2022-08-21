package LeetCodeAndOthers;

public class CountSortedArrayRotations {
    public static int findpivot(int[] arr){
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
        public static int countRotations(int[] arr){
                if(arr[0]<arr[arr.length-1]) return 0;
                return findpivot(arr)+1;
            }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 10};
        System.out.println(countRotations(arr));
    }
}
