package LeetCodeAndOthers;

import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int j : arr) {
            if (!hm.containsKey(j)) {
                hm.put(j, 1);
            } else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] arr1 ={1,2,3,4};
//        System.out.println(containsDuplicate(arr1));
        System.out.println();
    }

}
