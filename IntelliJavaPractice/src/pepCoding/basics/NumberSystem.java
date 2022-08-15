package pepCoding.basics;


public class NumberSystem {



    public static long decimal2Binary(int n) {
        long rem = 1;
        long temp = n;
        while (temp > 0) {
            rem += temp % 2;
            rem *= 10;
            temp /= 2;
        }

        return pepCoding.basics.ReverseNum.Reverse(rem) - 1;

    }

    public static long decimal2AnyBase(long decimalNum, int base) {
        long rem = 1;
        long temp = decimalNum;
        while (temp > 0) {
            rem += temp % base;
            rem *= 10;
            temp /= base;
        }

        return pepCoding.basics.ReverseNum.Reverse(rem) - 1;

    }

    public static long binary2Decimal(String n) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - '0') * Math.pow(2, n.length() - 1 - i);

        }

        return sum;

    }

    public static long anyBAse2Decimal(String num, int numBase) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += (num.charAt(i) - '0') * Math.pow(numBase, num.length() - 1 - i);

        }

        return sum;

    }

    public static long binary2Decimal(long x) {
        String n = Long.toString(x);
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - '0') * Math.pow(2, n.length() - 1 - i);

        }

        return sum;

    }

    public static long anyBaseAddition(String num1, String num2, int numBase) {
        return decimal2AnyBase(anyBAse2Decimal(num1, numBase) + anyBAse2Decimal(num2, numBase), numBase);

    }

    public static long anyBaseSubtraction(String num1, String num2, int numBase) {

        return decimal2AnyBase(anyBAse2Decimal(num1, numBase) - anyBAse2Decimal(num2, numBase), numBase);

    }
    public static long anyBaseMultiplication(String num1, String num2, int numBase) {

        return decimal2AnyBase(anyBAse2Decimal(num1, numBase) * anyBAse2Decimal(num2, numBase), numBase);

    }

    public static void main(String[] args) {
//
        System.out.println(decimal2Binary(13));
        System.out.println(binary2Decimal("110110100110101000101101110100100"));
        System.out.println(binary2Decimal(101011010100L));
        System.out.println(decimal2AnyBase(385, 8));
        System.out.println(anyBAse2Decimal("601", 8));
        System.out.println(anyBaseAddition("123123", "1231312", 10));
        System.out.println(anyBaseSubtraction("100", "50", 10));


    }
}
