package pepCoding.basics;

public class PrimesTillN {
    public static void fun(int low, int high){
        for (int i = low; i <= high; i++) {
            int times =0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) times++;
            }
            if(times==2) System.out.println("Number "+i+" is prime");
        }

    }
    public static void main(String[] args) {
        fun(10,20);

    }
}
