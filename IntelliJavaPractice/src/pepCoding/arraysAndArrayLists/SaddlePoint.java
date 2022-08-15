package pepCoding.arraysAndArrayLists;

public class SaddlePoint {
    public static void saddlePrice(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < arr[i][min]) min = j;
            }
            int max = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][min] > arr[max][min]) {
                    max = j;
                    break;

                }
            }
            if (max == i) System.out.println(min + " " + max);
        }
    }
}
