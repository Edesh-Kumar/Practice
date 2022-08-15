package pepCoding.arraysAndArrayLists;

public class MatrixMultiplication {
    public static void Display2DArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }

    public static int[][] TwoDArrayMultiply(int[][] arr1, int[][] arr2) {
//        colums size of first matrix should be equal to rows size of second matrix.
        if (arr1[0].length != arr2.length) {
            System.out.println("Invalid inputs: columns and rows don't match");
            return null;
        }
        int[][] res = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    res[i][j] += (arr1[i][k] * arr2[k][j]);
                }


            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {9, 2, 8}};

        int[][] arr2 = {{1, 2, 4}, {3, 2, 9}, {9, 10, 6}};
        Display2DArray(TwoDArrayMultiply(arr1, arr2));

    }
}
