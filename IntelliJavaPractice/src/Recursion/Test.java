package Recursion;

import companies.VelocitySoft;

public class Test {

    public static void sumTriangle(int[] arr) {
        if (arr.length == 0) return;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        sumTriangle(newArr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static int reverseNum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * 10 + reverseNum(n / 10);
    }
    public static void main(String[] args) {
//        System.out.println(fibonacci(48));
//        printNum(5);
//        int[] arr = {5, 6, 10, 11, 170, 60, 66, 70, 90};
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 60, 5, 8, 10, 0};
//        int i = 1;
//        System.out.println(productOfNto1(5));
//        System.out.println(sumOfN(5));
//        System.out.println(productOfDigits(1342));
//        System.out.println(productOfDigits(2342));


    }
}
