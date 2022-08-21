package dataStructures;

public class DSAMaths {
    public static boolean isEvenUsingBitwiseOperators(int n) {
        return (n & 1) == 0;
    }

    public static int FindSingleDistinct(int[] arr) {
//        array contains all the elements twice except one element.
        int res = 0;
        for (int i : arr) {
            res ^= i;
        }
        return res;
    }
    public static int FindIthBit(int num, int i){
        return num & (1<<(i-1));

        }

    public static void main(String[] args) {


        System.out.println(isEvenUsingBitwiseOperators(1299223122));
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(FindSingleDistinct(arr));
        System.out.println(FindIthBit(1011010001, 5));
        System.out.println(1<<(1));


    }
}
