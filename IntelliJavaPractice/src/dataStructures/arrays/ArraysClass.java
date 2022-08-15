package dataStructures.arrays;

public class ArraysClass {

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;


    }
    public static void display(int[] arr){
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i+", ");
        }
        System.out.print("]");
        }

    public static int[] reverse(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
        return a;
    }

    public static String toString(int[] a) {

        String s = "";
        for (int i : a) {
            s += i + " ";
        }
        return s;
    }

    public static int linearSearch(int[] a, int key) {
        int numLoops =0;
        for (int i = 0; i < a.length; i++) {
            numLoops++;
            if (a[i] == key) {
                System.out.println("Key found at index " + i);
                System.out.println("Took "+numLoops+" iterations");
                return i;
            }
        }
        System.out.println("Not Found");
        return -1;

    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length;
        int numLoops=0;
        while (low <= high) {
            numLoops++;
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                System.out.println("Key found at index: "+mid);
                System.out.println("Took "+numLoops+" iterations");
                return mid;
            }
            if (key < a[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        System.out.println("Took "+numLoops+" iterations");
        System.out.println("Key not found");
        return -1;



    }
//    public static int[] bubbleSort


}
