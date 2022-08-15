package pepCoding.arraysAndArrayLists;

import pepCoding.basics.Factorial;

public class Permutation {
    public static void stringPermutation(String str){
        int f = Factorial.factorial(str.length());
        int n = str.length();
        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int div = n; div >=1; div--) {
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp =q;

            }
            System.out.print("  ");
        }
            
        }

    public static void main(String[] args) {
        stringPermutation("Edesh");
        System.out.println(Factorial.factorial(5));
    }
}
