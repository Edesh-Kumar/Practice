package LeetCodeAndOthers;

public class FoundInMountainArray {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr, 0, mountainArr.length() - 1);
        int target1 = search(mountainArr, target, 0, peak, true);
        if (!(target1 == -1)) {
            return target1;
        } else {
            return search(mountainArr, target, peak, mountainArr.length() - 1, false);

        }
    }

    public static int search(MountainArray mountainArr, int target, int start, int end, boolean isAsc) {
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            int midElem = mountainArr.get(mid);
            if (midElem == target) return mid;
            else if (isAsc) {
                if (target < midElem) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midElem) end = mid - 1;
                else start = mid + 1;
            }
        }


        return -1;
    }

    public static int peak(MountainArray mountainArr, int start, int end) {
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) end = mid;
            else start = mid + 1;

        }
        return start;
    }

    public static void main(String[] args) {

        int[] arr3 = {1, 2, 3, 4, 5, 3, 1};

        int[] arr4 = {0, 1, 2, 4, 2, 1};


        MountainArray mountainArray = new MountainArray(arr3);
        System.out.println(findInMountainArray(3, mountainArray));
        System.out.println(mountainArray.getCount());
    }
}
