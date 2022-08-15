package pepCoding.arraysAndArrayLists;

public class StateOfWakanda2 {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        int col = 0;
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr[0].length; i++, j++) {
                System.out.print(arr[i][j] + " ");

            }
        }


    }
}
