package LeetCodeAndOthers;

public class CielingOfNumber {
    public static int cielingNum(int[] arr, int target) {
        if (target >= arr[arr.length - 1]) return arr[0];
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) return arr[mid + 1];
            if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return arr[start];
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s =0;
        int e = letters.length-1;
        int m = 0;
        while(s<=e){
            m = s+(e-s)/2;
            if(letters[m]== target){
                return (m==letters.length-1) ? letters[0]: letters[m+1];
            }
            else if(target>letters[m]) s= m+1;
            else e = m-1;
        }
        return letters[s];

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 14, 16, 18};
        char[] c = {'c', 'f','j'};
//        System.out.println(cielingNum(arr, 18));
//        System.out.println(nextGreatestLetter(c, 'd'));
        int e =3;
        int s =7;
        s=e=1;
        System.out.println(s+" "+e);
    }
}
