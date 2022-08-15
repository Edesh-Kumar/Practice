package pepCoding.arraysAndArrayLists;

public class StateOfWakanda {

    public static void stateOfWakanda(int[][] arr) {
        int k = arr.length;
        int z = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (i%2==0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]+" -> ");
                }
            }else {
                for (int j = arr.length-1; j >=0 ; j--) {
                    System.out.print(arr[j][i]+" -> ");

                }

            }

        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14,34},
                {21, 22, 23, 24,76},
                {31, 32, 33, 34,98}
        };
        stateOfWakanda(arr);
    }
}
