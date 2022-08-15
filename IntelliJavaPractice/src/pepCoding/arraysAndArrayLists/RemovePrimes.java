package pepCoding.arraysAndArrayLists;

import java.util.ArrayList;

public class RemovePrimes {
    public static Boolean primeCheck(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }


        return count == 2;
    }

    public static ArrayList<Integer> primeRemove(ArrayList<Integer> al) {
        for (int i = 0; i < al.size(); i++) {
            if (primeCheck(al.get(i))) al.remove(i);

        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(12);
        al.add(13);
        al.add(15);
        System.out.println(al);
        System.out.println(primeRemove(al));

    }
}
