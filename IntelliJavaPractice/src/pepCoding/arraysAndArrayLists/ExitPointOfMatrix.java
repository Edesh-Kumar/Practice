package pepCoding.arraysAndArrayLists;

public class ExitPointOfMatrix {
    public static void main(String[] args) {


        int[][] arr = {
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        int row = 0;
        int col = 0;
        int dir = 0;
        while (true) {
            dir = (dir + arr[row][col]) % 4;

            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else if (dir == 3) {
                row--;
            }

            if (row < 0) {
                row++;
                break;
            } else if (col < 0) {
                col++;
                break;
            } else if (row >= arr.length) {
                row--;
                break;
            } else if (col >= arr[0].length) {
                col--;
                break;
            }

        }
        System.out.println(row + " " + col);


    }


}

