package Recursion;

public class Nto1 {
    public static void Nto1(int n) {
        if (n == 0) {
            return;
        }

        Nto1(n - 1);
        System.out.println(n);


    }

    public static void main(String[] args) {

    }
}
