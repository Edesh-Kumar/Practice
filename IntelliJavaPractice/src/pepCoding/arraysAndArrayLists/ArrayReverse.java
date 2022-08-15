package pepCoding.arraysAndArrayLists;

public class ArrayReverse {
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            dataStructures.arrays.ArraysClass.swap(arr, i, arr.length - 1 - i);

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
       dataStructures.arrays.ArraysClass.display(arr);
    }
}
