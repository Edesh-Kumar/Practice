package pepCoding.arraysAndArrayLists;

public class BarChart {
    public static int maxOfArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }

        return arr[max];
    }

    public static void arrayBarChart(int[] arr) {
        int max = maxOfArray(arr);
        for (int i = max; i >0 ; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(i<=arr[j]){
                    System.out.print("* ");
                }else System.out.print("  ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {8,3,0,5,8};
        arrayBarChart(a);

    }
}
