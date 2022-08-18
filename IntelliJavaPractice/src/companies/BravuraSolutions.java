package companies;

public class BravuraSolutions {
    public static boolean palindromeOrNot(int i) {
        int temp =i;
        int res = 0;
        while (i>0) {
            res= (res*10)+ (i%10);
            i/=10;
        }
        System.out.println(res);
        return res == temp;
    }

    public static void main(String[] args) {
        System.out.println(palindromeOrNot(191));

    }
}
