package pepCoding.arraysAndArrayLists;

public class Search {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }

        return -1;
    }

    public static String linearSearch(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) return "Found at row " + i + " and column " + j;
            }
        }
        return "Not found";
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) return mid;
            if (key > arr[mid]) low = mid + 1;
            else high = mid - 1;

        }
        return -1;
    }

    public static String binarySearch(int[][] arr, int key) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row<arr.length && col >= 0) {
            if (arr[row][col] == key) {
                return row + " " + col;
            }
            else if(key<arr[row][col]){
                col--;
            }else row++;

        }


        return "Not Found";
    }
}

