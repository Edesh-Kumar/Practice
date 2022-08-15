package LeetCodeAndOthers;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum+=nums[i];

        }
        if(leftSum==rightSum) return 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];

            System.out.println("leftSum: " + leftSum + " rightSum: " + rightSum);

            if (leftSum == rightSum) return i;

        }


        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

    }
}
