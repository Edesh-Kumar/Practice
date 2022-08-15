package pepCoding.arraysAndArrayLists;

public class SpiralDisplay {
    public static void spiralDisplay(int[][] arr) {
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;
        while (maxcol >= 0) {
            //left wall
            for (int i = minrow; i <= maxrow; i++) {
                System.out.print(arr[i][mincol] + " ");

            }
            mincol += 1;
            //bottom wall
            for (int i = mincol; i <= maxcol; i++) {
                System.out.print(arr[maxrow][i] + " ");
            }
            maxrow -= 1;
            //right wall
            for (int i = maxrow; i >= minrow; i--) {
                System.out.print(arr[i][maxcol] + " ");
            }
            maxcol -= 1;


            //top wall
            for (int i = maxcol; i >= mincol; i--) {
                System.out.print(arr[minrow][i] + " ");
            }
            minrow += 1;


        }


    }


    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14, 15, 16, 17},
                {21, 22, 23, 24, 25, 26, 27},
                {31, 32, 33, 34, 35, 36, 37},
                {41, 42, 43, 44, 45, 46, 47},
                {51, 52, 53, 54, 55, 56, 57}
        };


        spiralDisplay(arr);
    }
}
