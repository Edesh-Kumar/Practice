package pepCoding.arraysAndArrayLists;

import java.util.Scanner;

public class CreateMatrixWithInput {
    public static int[][] createMatrix(int rowSize, int colSize) {
        int[][] arr = new int[rowSize][colSize];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            return arr;
        }
}
