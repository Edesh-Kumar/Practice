package companies;

import java.util.HashMap;

public class BravuraSolutions {
    public static boolean palindromeOrNot(int i) {
        int temp = i;
        int res = 0;
        while (i > 0) {
            res = (res * 10) + (i % 10);
            i /= 10;
        }
        System.out.println(res);
        return res == temp;
    }


    public static void frequencyOfNumber(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
            else hm.put(i, 1);
        }

        System.out.println(hm);

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        frequencyOfNumber(arr);

    }
}
