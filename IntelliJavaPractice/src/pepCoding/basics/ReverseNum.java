package pepCoding.basics;

public class ReverseNum {
    public static long Reverse(long n){
        long res =0;
        while(n>0){
            res*=10;
            res +=n%10;
            n/=10;
        }
        return res;
    }

}
