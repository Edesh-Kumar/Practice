package pepCoding.arraysAndArrayLists;

public class SortInHalf {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static int[] sortInHalf(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                int min = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[min]) min = j;
                }

                swap(arr, i, min);
            } else {
                int max = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] > arr[max]) max = j;

                }

                swap(arr, i, max);

            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 3, 4, 5, 6, 8, 0, 8};
        int[] arr1 = {5, 2, 4, 7, 9, 3, 1, 6, 8,10,13,11};
        for (int i : sortInHalf(arr1)) {
            System.out.print(i + " ");

        }
    }
}

