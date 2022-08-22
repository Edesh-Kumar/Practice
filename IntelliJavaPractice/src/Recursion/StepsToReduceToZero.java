package Recursion;

public class StepsToReduceToZero {
    public static int stepsToReduceToZero(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0) return 1+ stepsToReduceToZero(n/2);
        else return  1 + stepsToReduceToZero(--n);

    }

    public static void main(String[] args) {

    }
}
