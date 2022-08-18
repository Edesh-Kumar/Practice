package companies;

public class VelocitySoft {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static Boolean checkIfPresent(int[] arr, int n, int pos) {
        for (int i = 0; i < pos; i++) {
            if (arr[i] == n) {
                return true;
            }

        }
        return false;

    }


    public static void question1(int[] arr) {
        int pos = 0;
        int[] track = new int[arr.length];
        for (int k : arr) {
            int count = 0;
            if (checkIfPresent(track, k, pos)) {
                continue;
            } else {
                track[pos] = k;
                pos++;
                for (int i : arr) {
                    if (i == k) count++;

                }
                if (count == 1) {
                    System.out.print(k + " ");
                }
            }

        }


    }

    public static int numOfDigits(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;

        }

        return res;
    }

    public static void Question2(int n) {
        int[] fibArr = new int[numOfDigits(n)];
        int num1 = 0;
        int num2 = 1;
        for (int i = fibArr.length - 1; i >= 0; i--) {
            fibArr[i] = num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fibArr[pos] + "   ");
                pos++;
            }
            System.out.println();

        }

    }

    public static int[] Question4Part1(int[] arr) {
        int[] res = new int[arr.length];

        int pos = 0;
        for (int k : arr) {
            if (k == 0) {

                res[pos] = 0;
                pos++;


            }
        }
        for (int j : arr) {

            if (j != 0) {
                res[pos] = j;
                if (pos < arr.length - 1) {
                    pos++;
                }
            }
        }

        return res;


    }

    public static int[] Question4Part2(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j > pos; j--) {
                    swap(arr, j, j - 1);
                }
                pos++;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        //Question1
        int[] arr1 = {1,2,3,4,1,2,3,1,2,1};
        int[] arr4 = {72, 37, 276, 1, 0, 132, 13, 13, 18, 0, 0, 1, 3, 8, 0};

//        question1(arr1);
//        Question2(5);


//        for (int i : Question4Part1(arr4)) {
//            System.out.print(i + " ");
//        }
        System.out.println();
        for (int i : Question4Part2(arr4)) {
            System.out.print(i+" ");

        }
//        Question4Part1(arr4);


    }
}
