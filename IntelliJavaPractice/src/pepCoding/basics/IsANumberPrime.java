package pepCoding.basics;

public class IsANumberPrime {
    public static void main(String[] args) {
        int num = 2;
        int times =0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) times++;
        }
        System.out.println(times==2 ? "Prime": "Not Prime");
    }
}
