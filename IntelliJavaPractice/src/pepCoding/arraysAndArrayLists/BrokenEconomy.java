package pepCoding.arraysAndArrayLists;

public class BrokenEconomy {
    public static void brokenEconomy(int[] arr, int key) {
        int low =0;
        int high = arr.length;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==key){
                System.out.println(arr[mid]);
                return;
            }
            if (arr[mid]<key) low=mid+1;
            else high = mid-1;


        }
        System.out.println(arr[high+1]);
        System.out.println(arr[high]);




        }

    public static void main(String[] args) {
        int[] a ={5, 10, 15, 22, 33, 40, 42, 55};
        brokenEconomy(a, 45);
    }
}
