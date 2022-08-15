package pepCoding.arraysAndArrayLists;

public class RotateMatrix {
    public static void swap(int[][] arr, int row1, int col1, int row2, int col2) {
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
    }

    public static int[][] rotate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                swap(arr, i, j, j, i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                swap(arr, i, j, i, arr[0].length - 1 - j);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
//            // 0   1   2   3
                {11, 12, 13, 14}, //0
                {21, 22, 23, 24}, //1
                {31, 32, 33, 34}, //2
                {41, 42, 43, 44}  //3
        };
        System.out.println(Search.binarySearch(arr, 45));
        SaddlePoint.saddlePrice(arr);
//        Display.Display2DArray(rotate(arr));


    }
}
