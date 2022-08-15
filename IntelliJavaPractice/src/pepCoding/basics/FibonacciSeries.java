package pepCoding.basics;

public class FibonacciSeries {
    public static int fiboFormula(int n){
            return (int)(Math.pow(1.6180339,n)/Math.sqrt(5));
        }
    public static void main(String[] args) {
//        int n = 10;
//        int a = 0;
//        int b = 1;
//        int c = 0;
//        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            System.out.print((c = a + b) + " ");
//            a = b;
//            b = c;
//
//
//        }
        for (int i = 0; i < 10; i++) {
            System.out.print(fiboFormula(i)+" ");
        }

    }
}
