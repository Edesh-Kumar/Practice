package pepCoding.arraysAndArrayLists;

public class Display {
    public static void Display2DArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
