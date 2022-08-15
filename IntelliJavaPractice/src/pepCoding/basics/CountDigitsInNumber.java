package pepCoding.basics;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        int n =65784383;
        int digits =0;
        while (n>0){
            n/=10;
            digits++;
        }
        System.out.println(digits);
    }

}
